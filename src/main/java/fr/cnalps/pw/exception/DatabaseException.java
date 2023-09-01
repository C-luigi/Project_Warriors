package fr.cnalps.pw.exception;

/**
 * Represents exceptions that are specific to database operations.
 */

public class DatabaseException extends Exception {

    /**
     * Constructs a new DatabaseException with the specified detail message.
     *
     * @param message the detail message. The detail message is saved for later retrieval by the {@link #getMessage()} method.
     */

    public DatabaseException(String message) {
        super(message);
    }

    /**
     * Constructs a new DatabaseException with the specified detail message and cause.
     *
     * @param message the detail message. The detail message is saved for later retrieval by the {@link #getMessage()} method.
     * @param cause   the cause of the exception. The cause is saved for later retrieval by the {@link #getCause()} method.
     *                A null value indicates that the cause is nonexistent or unknown.
     */

    public DatabaseException(String message, Throwable cause) {
        super(message, cause);
    }

}
