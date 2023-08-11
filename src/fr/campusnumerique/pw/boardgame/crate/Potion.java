package fr.campusnumerique.pw.boardgame.crate;

import fr.campusnumerique.pw.boardgame.Square;

public abstract class Potion extends Square {
    private final String name;
    private final int stat;

    public Potion(String name, int stat){
        this.name = name;
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Potion : " + name + '\n' +
                "stat = " + stat;
    }
}
