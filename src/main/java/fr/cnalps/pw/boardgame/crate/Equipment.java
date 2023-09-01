package fr.cnalps.pw.boardgame.crate;

import fr.cnalps.pw.boardgame.Square;

public abstract class Equipment extends Square {
    private final String name;
    private final int stat;

    public Equipment(String name, int stat){
        this.name = name;
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Equipment:" + '\n' +
                name +
                "; damage = " + stat;
    }
}