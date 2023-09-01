package fr.cnalps.pw.boardgame.crate.equipment.magicianequipment;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.equipment.Equipment;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.character.Warrior;

/**
 * Represents the "FireBall" equipment in the game.
 * The Sword is equipment that not all character types may use.
 */

public class FireBall extends Equipment {

    /**
     * Constructs the "FireBall" equipment with predefined attributes.
     * The Sword is associated with a specific stat, indicating its power.
     */

    public FireBall() {
        super("Fire Ball", 7);
    }

    /**
     * Defines the interaction that occurs when a character encounters the FireBall.
     * Warrior are unable to use the FireBall, and a specific message is shown to them.
     * Other characters can take up the FireBall, and the FireBall becomes their equipment.
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
