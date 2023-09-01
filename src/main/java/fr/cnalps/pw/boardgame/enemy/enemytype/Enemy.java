package fr.cnalps.pw.boardgame.enemy.enemytype;

import fr.cnalps.pw.boardgame.Square;

/**
 * Represents an abstract enemy entity on the game board.
 * This class provides a foundation for different enemy types,
 * encapsulating attributes and methods common to all enemies.
 */

public abstract class Enemy extends Square {
    private final String typeEnemy;
    private final int healthPointEnemy;
    private final int strongPointEnemy;

    /**
     * Constructs an enemy of a specific type with defined health and strength points.
     *
     * @param typeEnemy The type or classification of the enemy.
     * @param healthPointEnemy The health points of the enemy, indicating its vitality.
     * @param strongPointEnemy The strength or attack points of the enemy.
     */

    public Enemy(String typeEnemy, int healthPointEnemy, int strongPointEnemy){
        this.typeEnemy = typeEnemy;
        this.healthPointEnemy = healthPointEnemy;
        this.strongPointEnemy = strongPointEnemy;
    }

    /**
     * Provides a string representation of the enemy, detailing its type, health, and strength points.
     *
     * @return A string describing the enemy's attributes.
     */

    @Override
    public String toString() {
        return "Enemy !!!" + '\n' +
                typeEnemy +
                "; HP = " + healthPointEnemy +
                "; SP = " + strongPointEnemy;
    }

}
