package com.example.calculator.dto.response;

import com.example.calculator.domain.entity.JournalRecord;

public class JournalRecordsResponse {

    private Iterable<JournalRecord> journal;

    public JournalRecordsResponse(Iterable<JournalRecord> journal) {
        this.journal = journal;
    }

    public Iterable<JournalRecord> getJournal() {
        return journal;
    }

    public void setJournal(Iterable<JournalRecord> journal) {
        this.journal = journal;
    }
}
