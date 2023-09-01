package fr.cnalps.pw.exception;

/**
 * Represents exceptions arising when a character moves beyond the permissible case of the game board.
 */

public class CharacterOutOfBoardException extends Exception {

    /**
     * Constructs a new CharacterOutOfBoardException with the specified detail message.
     *
     * @param message the detail message describing the exception's cause. The message is saved for later retrieval by the {@link #getMessage()} method.
     */

    public CharacterOutOfBoardException(String message) {
        super(message);
    }
}
