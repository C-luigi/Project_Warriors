package fr.cnalps.pw.character;

import fr.cnalps.pw.boardgame.crate.equipment.Equipment;

/**
 * Magician character type which extends the generic Character class.
 * A Magician possesses unique equipment that can affect gameplay.
 */

public class Magician extends Character {
    private Equipment equipment;

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
        this.equipment = equipment;
    }

    /**
     * Retrieves the Warrior's equipment.
     *
     * @return The equipment of the Warrior.
     */

    public Equipment getEquipment() {
        return equipment;
    }

    /**
     * Sets or updates the Warrior's equipment.
     *
     * @param equipment The new equipment to be assigned to the Warrior.
     */

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    /**
     * Returns a string representation of the Warrior character, including its equipment.
     *
     * @return A string detailing the Warrior's attributes and equipment.
     */

    @Override
    public String toString() {
        return super.toString() + '\n' + equipment;
    }
}
