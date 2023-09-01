package fr.cnalps.pw.boardgame.enemy.enemytype;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.character.Character;

/**
 * Represents a Dragon enemy type.
 * The Dragon is extended of enemy.
 */

public class Dragon extends Enemy{

    /**
     * Constructs a Dragon with predefined attributes.
     * The attributes might represent properties like health, attack strength, etc.
     */

    public Dragon() {
        super("Dragon", 15, 4);
    }

    /**
     * Describes the interaction between a character and the Dragon enemy.
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
