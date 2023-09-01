package fr.cnalps.pw.character;

import fr.cnalps.pw.boardgame.crate.Equipment;

public class Warrior extends Character {
    private Equipment equipment;

    public Warrior() {
        super("bobby",5,8);
    }

    /**
     *
     * @param name
     * @param healthPoints
     * @param strongPoints
     * @param equipment
     */
    public Warrior(String name, int healthPoints, int strongPoints, Equipment equipment) {
        super(name, healthPoints, strongPoints);
        this.equipment = equipment;
    }

    /**
     *
     * @return
     */
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