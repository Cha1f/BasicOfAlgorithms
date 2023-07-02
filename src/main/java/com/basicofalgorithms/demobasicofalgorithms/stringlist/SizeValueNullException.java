package com.basicofalgorithms.demobasicofalgorithms.stringlist;

public class SizeValueNullException extends RuntimeException {
    public SizeValueNullException() {
    }

    public SizeValueNullException(String message) {
        super(message);
    }

    public SizeValueNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public SizeValueNullException(Throwable cause) {
        super(cause);
    }

    public SizeValueNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
