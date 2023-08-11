package fr.campusnumerique.pw.boardgame;

import fr.campusnumerique.pw.character.Character;

public class EmptySquare extends Square {
    public String toString() {
        return "Empty case";
    }

    @Override
    public Square interaction(Character character) {

        return null;
    }
}
