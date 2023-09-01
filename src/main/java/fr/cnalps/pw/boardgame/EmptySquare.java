package fr.cnalps.pw.boardgame;

import fr.cnalps.pw.character.Character;

public class EmptySquare extends Square {
    public String toString() {
        return "Empty case";
    }

    @Override
    public Square interaction(Character character) {

        return null;
    }
}
