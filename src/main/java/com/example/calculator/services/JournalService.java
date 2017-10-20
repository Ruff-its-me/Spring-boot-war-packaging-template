package com.example.calculator.services;

import com.example.calculator.domain.entity.JournalRecord;
import com.example.calculator.domain.repository.JournalRecordRepository;
import com.example.calculator.dto.request.JournalRecordDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JournalService {

    private JournalRecordRepository journalRecordRepository;

    @Autowired
    public JournalService(JournalRecordRepository journalRecordRepository) {
        this.journalRecordRepository = journalRecordRepository;
    }


    public List<JournalRecord> getAllJournalRecords() {
        return journalRecordRepository.findAll();
    }

    public JournalRecord createJournalRecord(JournalRecordDto dto) {
        JournalRecord record = new JournalRecord(null, new Date(dto.getTimeStamp()), dto.getMemo());
        return journalRecordRepository.save(record);
    }
}
