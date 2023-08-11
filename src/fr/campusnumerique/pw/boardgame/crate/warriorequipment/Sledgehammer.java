package fr.campusnumerique.pw.boardgame.crate.warriorequipment;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.boardgame.crate.Equipment;
import fr.campusnumerique.pw.character.Character;
import fr.campusnumerique.pw.character.Magician;

public class Sledgehammer extends Equipment {
    public Sledgehammer() {
        super("Sledgehammer", 3);
    }

    @Override
    public Square interaction(Character character) {
        if (character instanceof Magician){
            System.out.println("wretch, you don't have the strength");
        } else {
            System.out.println("your strength allows you to master a new weapon");
            character.setEquipment(this);
        }
        return null;
    }
}
