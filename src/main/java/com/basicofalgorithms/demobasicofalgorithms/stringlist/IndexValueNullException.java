package com.basicofalgorithms.demobasicofalgorithms.stringlist;

public class IndexValueNullException extends RuntimeException {
    public IndexValueNullException() {
    }

    public IndexValueNullException(String message) {
        super(message);
    }

    public IndexValueNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexValueNullException(Throwable cause) {
        super(cause);
    }

    public IndexValueNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
