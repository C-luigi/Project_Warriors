package fr.cnalps.pw.dice;

/**
 * Represents a six-faced dice
 */

public class DieSixFace implements Dice {

    /**
     * roll the dice
     * @return an int [1,6]
     */

    @Override
    public int roll() {
        return (int)(Math.random() * 6) + 1;
    }
}
