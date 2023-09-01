package fr.cnalps.pw.boardgame.crate.equipment;

import fr.cnalps.pw.boardgame.Square;

/**
 * Represents an abstract equipment entity.
 * This class provides a foundation for different types of equipment,
 * encapsulating attributes and methods common to all equipment pieces.
 */

public abstract class Equipment extends Square {
    private final String name;
    private final int stat;

    /**
     * Constructs equipment with a specified name and associated stat.
     *
     * @param name The name or identification of the equipment.
     * @param stat The statistic or value associated with the equipment,
     *             typically representing its power or efficacy.
     */

    public Equipment(String name, int stat){
        this.name = name;
        this.stat = stat;
    }

    /**
     * Provides a string representation of the equipment, detailing its name and associated stat.
     *
     * @return A string describing the equipment's attributes.
     */

    @Override
    public String toString() {
        return "Equipment:" + '\n' +
                name +
                "; damage = " + stat;
    }
}