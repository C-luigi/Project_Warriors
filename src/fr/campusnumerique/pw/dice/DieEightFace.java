package fr.campusnumerique.pw.dice;

public class DieEightFace implements Dice{
    @Override
    public int roll() {
        return (int)(Math.random() * 8) + 1;
    }
}
