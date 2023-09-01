package fr.cnalps.pw.character;

import fr.cnalps.pw.boardgame.crate.Equipment;

/**
 * A magicien, which is a special character
 */
public class Magician extends Character {
    private Equipment equipment;

    /**
     * Construct a magician with specifi name, etc.
     * @param name The name of the M
     * @param healthPoints ...
     * @param strongPoints
     * @param equipment
     */
    public Magician(String name, int healthPoints, int strongPoints, Equipment equipment) {
        super(name, healthPoints, strongPoints);
        this.equipment = equipment;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + equipment;
    }
}
