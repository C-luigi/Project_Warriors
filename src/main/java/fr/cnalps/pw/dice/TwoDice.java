package fr.cnalps.pw.dice;

/**
 * Represents a combination of two six-faced dice
 */

public class TwoDice implements Dice{
    private final DieSixFace de1 = new DieSixFace();
    private final DieSixFace de2 = new DieSixFace();

    /**
     * roll the dice
     * @return an int [2,12]
     */
    public int roll() {
        return de1.roll() + de2.roll();
    }
}
