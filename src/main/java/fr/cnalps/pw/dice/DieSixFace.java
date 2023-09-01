package fr.cnalps.pw.dice;

public class DieSixFace implements Dice {
    @Override
    public int roll() {
        return (int)(Math.random() * 6) + 1;
    }
}
