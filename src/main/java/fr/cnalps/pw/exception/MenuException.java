package fr.cnalps.pw.exception;

/**
 * Represents an exception specific to the game's menu operations.
 */

public class MenuException extends Exception {

    /**
     * Constructs a new MenuException with the specified detail message and cause.
     *
     * @param message the detail message (which is saved for later retrieval by the {@link #getMessage()} method).
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method).
     *              A null value is permitted, and indicates that the cause is nonexistent or unknown.
     */


    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }

}
