package fr.campusnumerique.pw.dice;

public class TwoDice implements Dice{
    private DieSixFace de1 = new DieSixFace();
    private DieSixFace de2 = new DieSixFace();

    @Override
    public int roll() {
        return de1.roll() + de2.roll();
    }
}
