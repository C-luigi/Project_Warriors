package fr.campusnumerique.pw.boardgame.crate.magicianequipment;

import fr.campusnumerique.pw.boardgame.crate.Equipment;
import fr.campusnumerique.pw.character.Character;
import fr.campusnumerique.pw.character.Warrior;

public class FireBall extends Equipment {
    public FireBall() {
        super("Fire Ball", 7);
    }

    @Override
    public void interaction(Character character) {
        if (character instanceof Warrior){
            System.out.println("you're not sharp enough to use that");
        } else {
            character.setEquipment(this);
        }
    }
}
