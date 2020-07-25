package com.otus.nickolaymudry.hw2.dto;

public class ResponseDto {
    private final String status;

    public static ResponseDto of(String status) {
        return new ResponseDto(status);
    }

    protected ResponseDto(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
