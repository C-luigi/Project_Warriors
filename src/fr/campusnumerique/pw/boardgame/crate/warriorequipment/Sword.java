package fr.campusnumerique.pw.boardgame.crate.warriorequipment;

import fr.campusnumerique.pw.boardgame.crate.Equipment;
import fr.campusnumerique.pw.boardgame.crate.magicianequipment.FireBall;
import fr.campusnumerique.pw.character.Character;
import fr.campusnumerique.pw.character.Magician;
import fr.campusnumerique.pw.character.Warrior;

public class Sword extends Equipment {
    public Sword() {
        super("Sword", 5);
    }

    @Override
    public void interaction(Character character) {
        if (character instanceof Magician){
            System.out.println("wretch, you don't have the strength");
        } else {
            character.setEquipment(this);
        }
    }
}