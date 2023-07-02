package com.basicofalgorithms.demobasicofalgorithms.stringlist;

public class ItemValueNullException extends RuntimeException {
    public ItemValueNullException() {
    }

    public ItemValueNullException(String message) {
        super(message);
    }

    public ItemValueNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemValueNullException(Throwable cause) {
        super(cause);
    }

    public ItemValueNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
