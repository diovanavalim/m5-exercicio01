package com.meli.obterdiploma.exception;

import java.time.LocalDateTime;

public class ExceptionDetails {
    private String title;
    private int status;
    private String message;
    private LocalDateTime timestamp;

    public ExceptionDetails(String title, int status, String message, LocalDateTime timestamp) {
        this.title = title;
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
