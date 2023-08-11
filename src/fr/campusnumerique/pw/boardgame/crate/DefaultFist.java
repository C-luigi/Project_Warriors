package fr.campusnumerique.pw.boardgame.crate;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.character.Character;

public class DefaultFist extends Equipment {
    public DefaultFist() {
        super("Fist", 0);
    }

    @Override
    public Square interaction(Character character) {

        return null;
    }
}
