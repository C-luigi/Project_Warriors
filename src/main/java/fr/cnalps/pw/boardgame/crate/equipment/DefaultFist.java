package fr.cnalps.pw.boardgame.crate;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.equipment.Equipment;
import fr.cnalps.pw.character.Character;

public class DefaultFist extends Equipment {
    public DefaultFist() {
        super("Fist", 0);
    }

    @Override
    public Square interaction(Character character) {

        return null;
    }
}
