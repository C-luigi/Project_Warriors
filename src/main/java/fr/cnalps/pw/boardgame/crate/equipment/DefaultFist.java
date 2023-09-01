package fr.cnalps.pw.boardgame.crate.equipment;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.character.Character;

/**
 * Represents default equipment.
 * The "Fist" is a basic form of equipment with no special attributes or stats.
 */

public class DefaultFist extends Equipment {

    /**
     * Constructs the default "Fist" equipment with predefined attributes.
     */

    public DefaultFist() {
        super("Fist", 0);
    }

    /**
     * Describes the interaction between a character and the "Fist" equipment.
     *
     * @param character The character that encounters or interacts with the "Fist" equipment.
     * @return null
     */

    @Override
    public Square interaction(Character character) {

        return null;
    }
}