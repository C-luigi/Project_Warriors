package fr.cnalps.pw.boardgame.crate.equipment.warriorequipment;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.equipment.Equipment;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.character.Magician;

/**
 * Represents the "Sword" equipment in the game.
 * The Sword is equipment that not all character types may use.
 */

public class Sword extends Equipment {

    /**
     * Constructs the "Sword" equipment with predefined attributes.
     * The Sword is associated with a specific stat, indicating its power.
     */

    public Sword() {
        super("Sword", 5);
    }

    /**
     * Defines the interaction that occurs when a character encounters the Sword.
     * Magicians are unable to use the Sword, and a specific message is shown to them.
     * Other characters can take up the sword, and the Sword becomes their equipment.
     *
     * @param character The character that encounters or attempts to interact with the Sword.
     * @return null
     */

    @Override
    public Square interaction(Character character) {
        if (character instanceof Magician){
            System.out.println("wretch, you don't have the strength");
        } else {
            character.setEquipment(this);
            System.out.println("your strength allows you to master a new weapon");
        }
        return null;
    }
}