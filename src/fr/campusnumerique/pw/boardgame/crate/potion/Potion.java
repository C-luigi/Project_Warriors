package fr.campusnumerique.pw.boardgame.crate.potion;

import fr.campusnumerique.pw.boardgame.crate.Crate;
import fr.campusnumerique.pw.boardgame.crate.equipment.Equipment;

import java.util.ArrayList;

public abstract class Potion{
    private final String name;
    private final int stat;

    public Potion(String name, int stat){
        this.name = name;
        this.stat = stat;
    }

    public String toString() {
        return "Equipment:" + '\n' +
                "Type : " + name + '\n' +
                "stat = " + stat;
    }
}
