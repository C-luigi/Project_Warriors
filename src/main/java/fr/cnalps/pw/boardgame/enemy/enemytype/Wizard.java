package fr.cnalps.pw.boardgame.enemy.enemytype;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.character.Character;

/**
 * Represents a Wizard enemy type.
 * The Wizard is extended of enemy.
 */

public class Wizard extends Enemy{

    /**
     * Constructs a Wizard with predefined attributes.
     * The attributes might represent properties like health, attack strength, etc.
     */

    public Wizard() {
        super("Wizard", 9, 2);
    }

    /**
     * Describes the interaction between a character and the Wizard enemy.
     *
     * @param character The character that lands or interacts with the Wizard square.
     * @return null
     */

    @Override
    public Square interaction(Character character) {
        System.out.println("COMBAT!!!");
        return null;
    }
}
