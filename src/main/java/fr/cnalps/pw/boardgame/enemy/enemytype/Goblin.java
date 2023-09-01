package fr.cnalps.pw.boardgame.enemy.enemytype;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.character.Character;

/**
 * Represents a Goblin enemy type.
 * The Goblin is extended of enemy.
 */

public class Goblin extends Enemy{

    /**
     * Constructs a Goblin with predefined attributes.
     * The attributes might represent properties like health, attack strength, etc.
     */

    public Goblin() {
        super("Goblin", 6, 1);
    }

    /**
     * Describes the interaction between a character and the Goblin enemy.
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
