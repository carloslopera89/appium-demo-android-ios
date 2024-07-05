package com.co.demomobile.lineabase.exceptions;

public class CucumberRunnerException extends RuntimeException {

    public CucumberRunnerException() {
        super();
    }

    public CucumberRunnerException(String message) {
        super(message);
    }

    public CucumberRunnerException(String message, Throwable cause) {
        super(message, cause);
    }

}

