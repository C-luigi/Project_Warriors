package fr.cnalps.pw.boardgame.crate.magicianequipment;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.Equipment;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.character.Warrior;

public class Lightning extends Equipment {
    public Lightning() {
        super("Lightning", 2);
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
