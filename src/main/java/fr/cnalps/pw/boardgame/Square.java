package fr.cnalps.pw.boardgame;

import fr.cnalps.pw.character.Character;

/**
 * Represents an abstract game board square.
 * Serves as a base for different types of squares that may have varied interactions with characters.
 */

public abstract class Square {

    /**
     * Provides a string representation of the square.
     *
     * @return A string describing the square.
     */

    public abstract String toString();

    /**
     * Defines an interaction between the square and a character.
     * This interaction can influence the character's attributes, position, or other gameplay elements.
     *
     * @param character The character that interacts with the square.
     * @return A potentially new or modified square based on the interaction outcome.
     */

    public abstract Square interaction(Character character);
}
