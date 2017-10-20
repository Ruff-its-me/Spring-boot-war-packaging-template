package com.example.calculator.endpoints;

import com.example.calculator.domain.entity.JournalRecord;
import com.example.calculator.dto.request.JournalRecordDto;
import com.example.calculator.dto.response.JournalRecordDetailsResponse;
import com.example.calculator.dto.response.JournalRecordsResponse;
import com.example.calculator.services.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JournalController {

    private JournalService journalService;

    @Autowired
    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public JournalRecordsResponse getJornalRecords() {
        List<JournalRecord> allJournalRecords = journalService.getAllJournalRecords();
        JournalRecordsResponse response = new JournalRecordsResponse(allJournalRecords);
        return response;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    public JournalRecordDetailsResponse createJournalRecord(JournalRecordDto request) {
        JournalRecord record= journalService.createJournalRecord(request);
        JournalRecordDetailsResponse response = new JournalRecordDetailsResponse(record.getId(), record.getDate(), record.getMemo());
        return response;
    }

}
