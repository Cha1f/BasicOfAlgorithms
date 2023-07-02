package com.basicofalgorithms.demobasicofalgorithms.stringlist;

public class IndexOfItemNotFoundException extends RuntimeException {
    public IndexOfItemNotFoundException() {
    }

    public IndexOfItemNotFoundException(String message) {
        super(message);
    }

    public IndexOfItemNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexOfItemNotFoundException(Throwable cause) {
        super(cause);
    }

    public IndexOfItemNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
