package fr.cnalps.pw.boardgame.crate.equipment.magicianequipment;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.equipment.Equipment;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.character.Warrior;

/**
 * Represents the "Lightning" equipment in the game.
 * The Sword is equipment that not all character types may use.
 */

public class Lightning extends Equipment {

    /**
     * Constructs the "Lightning" equipment with predefined attributes.
     * The Sword is associated with a specific stat, indicating its power.
     */

    public Lightning() {
        super("Lightning", 2);
    }

    /**
     * Defines the interaction that occurs when a character encounters the Lightning.
     * Warrior are unable to use the Lightning, and a specific message is shown to them.
     * Other characters can take up the Lightning, and the Lightning becomes their equipment.
     *
     * @param character The character that encounters or attempts to interact with the Sword.
     * @return null
     */

    @Override
    public Square interaction(Character character) {
        if (character instanceof Warrior){
            System.out.println("you're not sharp enough to use that");
        } else {
            System.out.println("your intellect gives you a new spell");
            character.setEquipment(this);
        }
        return null;
    }
}
