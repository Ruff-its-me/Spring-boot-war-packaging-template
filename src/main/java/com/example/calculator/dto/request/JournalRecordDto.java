package com.example.calculator.dto.request;

public class JournalRecordDto {

    private Long timeStamp;
    private String memo;

    public JournalRecordDto() {
    }

    public JournalRecordDto(Long timeStamp, String memo) {
        this.timeStamp = timeStamp;
        this.memo = memo;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
