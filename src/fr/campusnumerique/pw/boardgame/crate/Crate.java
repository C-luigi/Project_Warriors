package fr.campusnumerique.pw.boardgame.crate;

import fr.campusnumerique.pw.boardgame.Case;
import fr.campusnumerique.pw.boardgame.crate.equipment.Equipment;
import fr.campusnumerique.pw.boardgame.crate.potion.Potion;

public class Crate extends Case {
    private final Potion potion;
    private final Equipment equipment;

    public Crate(Potion potion, Equipment equipment) {
        this.potion = potion;
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "suprise crate";
    }
}
