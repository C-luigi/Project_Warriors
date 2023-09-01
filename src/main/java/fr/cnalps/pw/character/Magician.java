package fr.cnalps.pw.character;

import fr.cnalps.pw.boardgame.crate.equipment.Equipment;

/**
 * Magician character type which extends the generic Character class.
 * A Magician possesses unique equipment that can affect gameplay.
 */

public class Magician extends Character {

    /**
     * Constructs a Magician character with specified attributes and equipment.
     *
     * @param name The name of the Magician.
     * @param healthPoints The health points or vitality of the Magician.
     * @param strongPoints The strength or attack points of the Magician.
     * @param equipment The equipment associated with the Warrior which can affect gameplay.
     */
    public Magician(String name, int healthPoints, int strongPoints, Equipment equipment) {
        super(name, healthPoints, strongPoints);
        super.setEquipment(equipment);
    }
}
