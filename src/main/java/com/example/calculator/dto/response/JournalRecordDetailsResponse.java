package com.example.calculator.dto.response;

import java.util.Date;

public class JournalRecordDetailsResponse {

    private Long id;
    private Date date;
    private String memo;


    public JournalRecordDetailsResponse(Long id) {
        this.id = id;
    }

    public JournalRecordDetailsResponse(Long id, Date date, String memo) {
        this.id = id;
        this.date = date;
        this.memo = memo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
