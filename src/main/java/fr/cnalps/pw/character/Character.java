package fr.cnalps.pw.character;

import fr.cnalps.pw.boardgame.crate.equipment.Equipment;

/**
 * Represents an abstract base character.
 * Defines common attributes and methods shared across various character types.
 * All new character types should extend this class.
 */
public abstract class Character {
    protected String name;
    protected int healthPoints;
    protected int strongPoints;
    
    protected Equipment equipment;

    /**
     * Default constructor initializing the character with default attributes.
     */

    public Character() {
        this.name = "bobby";
        this.healthPoints = 5;
        this.strongPoints = 8;
    }

    /**
     * Constructs a character with a specified name, and default health and strength points.
     *
     * @param name The name of the character.
     */

    public Character(String name) {
        this();
        this.name = name;
    }

    /**
     * Constructs a character with specified attributes.
     *
     * @param name The name of the character.
     * @param healthPoints The health or vitality points of the character.
     * @param strongPoints The strength or attack points of the character.
     */

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

    /**
     * Provides a formatted string representation of the character's attributes.
     *
     * @return A string detailing the character's name, health, and strength points.
     */

    public String toString() {
        return "------------------------------" +  '\n' +
                "Character:" + '\n' +
                name +
                "; HP = " + healthPoints +
                "; SP = " + strongPoints;
    }
}