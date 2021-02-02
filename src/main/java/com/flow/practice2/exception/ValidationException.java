package com.flow.practice2.exception;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ValidationException extends Exception{

    public int validationException() {
        return Response.SC_BAD_REQUEST;
    }
}
