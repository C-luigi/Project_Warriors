package fr.campusnumerique.pw.character;

import fr.campusnumerique.pw.boardgame.crate.Equipment;

public abstract class Character {
    protected String name;
    protected int healthPoints;
    protected int strongPoints;
    
    protected Equipment equipment;

    public Character() {
        this.name = "bobby";
        this.healthPoints = 5;
        this.strongPoints = 8;
    }

    public Character(String name) {
        this();
        this.name = name;
    }

    public Character(String name, int healthPoints, int strongPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strongPoints = strongPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrongPoints() {
        return strongPoints;
    }

    public void setStrongPoints(int strongPoints) {
        this.strongPoints = strongPoints;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String toString() {
        return "------------------------------" +  '\n' +
                "Character:" + '\n' +
                name +
                "; HP = " + healthPoints +
                "; SP = " + strongPoints;
    }
}