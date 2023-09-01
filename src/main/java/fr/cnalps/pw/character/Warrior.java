package fr.cnalps.pw.character;

import fr.cnalps.pw.boardgame.crate.equipment.Equipment;

/**
 * Warrior character type which extends the generic Character class.
 * A Warrior possesses unique equipment that can affect gameplay.
 */

public class Warrior extends Character {

    /**
     * Default constructor which initializes the Warrior with default attributes.
     */

    public Warrior() {
        super("bobby",5,8);
    }

    /**
     * Constructs a Warrior character with specified attributes and equipment.
     *
     * @param name The name of the Warrior.
     * @param healthPoints The health points or vitality of the Warrior.
     * @param strongPoints The strength or attack points of the Warrior.
     * @param equipment The equipment associated with the Warrior which can affect gameplay.
     */
    public Warrior(String name, int healthPoints, int strongPoints, Equipment equipment) {
        super(name, healthPoints, strongPoints);
        super.setEquipment(equipment);
    }
}