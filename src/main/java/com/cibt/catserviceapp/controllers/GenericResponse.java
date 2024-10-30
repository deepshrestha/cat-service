package com.cibt.catserviceapp.controllers;
import org.springframework.http.HttpStatus;

public class GenericResponse<T> {
    
    private T data;
    private String message;
    private HttpStatus status;
    private Integer statusCode;

    public GenericResponse(T data, String message, HttpStatus status, Integer statusCode) {
        this.data = data;
        this.message = message;
        this.status = status;
        this.statusCode = statusCode;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }
    /**
     * @return the status
     */
    public HttpStatus getStatus() {
        return status;
    }
    /**
     * @return the statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }
}