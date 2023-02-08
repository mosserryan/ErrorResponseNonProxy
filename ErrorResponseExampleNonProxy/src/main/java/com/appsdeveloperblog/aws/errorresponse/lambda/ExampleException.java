package com.appsdeveloperblog.aws.errorresponse.lambda;

public class ExampleException extends RuntimeException {
    public ExampleException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
