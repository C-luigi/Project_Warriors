package fr.cnalps.pw.boardgame.crate.equipment.magicianequipment;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.equipment.Equipment;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.character.Warrior;

public class FireBall extends Equipment {
    public FireBall() {
        super("Fire Ball", 7);
    }

    @Override
    public Square interaction(Character character) {
        if (character instanceof Warrior){
            System.out.println("you're not sharp enough to use that");
        } else {
            System.out.println("your intellect gives you a new spell");
            character.setEquipment(this);
        }
        return null;
    }
}