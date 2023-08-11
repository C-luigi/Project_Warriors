package fr.campusnumerique.pw.character;

import fr.campusnumerique.pw.boardgame.crate.Equipment;

public class Warrior extends Character {
    private Equipment equipment;

    public Warrior(String name, int healthPoints, int strongPoints, Equipment equipment) {
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