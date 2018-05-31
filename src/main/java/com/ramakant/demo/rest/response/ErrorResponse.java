package com.ramakant.demo.rest.response;

import java.io.Serializable;

public class ErrorResponse implements Serializable {
    private static final long serialVersionUID = 7457694782438657935L;
    private String message;
    private String statusCode;

    public ErrorResponse(String message, String statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return this.message;
    }

    public String getStatusCode() {
        return this.statusCode;
    }
}
