package fr.cnalps.pw.dice;

/**
 * Represents a eight-faced dice
 */

public class DieEightFace implements Dice{

    /**
     * roll the dice
     * @return an int [1,8]
     */

    @Override
    public int roll() {
        return (int)(Math.random() * 8) + 1;
    }
}
