package fr.cnalps.pw.boardgame;

import fr.cnalps.pw.character.Character;

/**
 * Represents an empty square no special interactions when a character lands on or passes through it.
 */

public class EmptySquare extends Square {

    /**
     * Provides a string representation of the empty square.
     *
     * @return A string indicating that this square is an empty case.
     */

    @Override
    public String toString() {
        return "Empty case";
    }

    /**
     * Describes the interaction between a character and this empty square.
     * Given that this square is empty, no specific interactions or
     * modifications to the character occur.
     *
     * @param character The character that lands or interacts with the empty square.
     * @return null, as no changes or actions are made due to the interaction.
     */

    @Override
    public Square interaction(Character character) {

        return null;
    }
}
