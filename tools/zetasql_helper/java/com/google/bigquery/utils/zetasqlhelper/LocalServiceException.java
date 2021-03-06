package com.google.bigquery.utils.zetasqlhelper;

/**
 * Exception generated by the connection to ZetaSQL Helper server.
 */
public class LocalServiceException extends RuntimeException {

    public LocalServiceException(String message, RuntimeException exception) {
        super(message, exception);
    }

    public LocalServiceException(String message) {
        super(message);
    }
}
