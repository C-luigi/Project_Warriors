package fr.campusnumerique.pw.boardgame.crate.potion;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.boardgame.crate.Potion;
import fr.campusnumerique.pw.character.Character;

public class GreatHealPotion extends Potion {
    public GreatHealPotion() {
        super("Healing potion with major effect", 5);
    }

    @Override
    public Square interaction(Character character) {
        System.out.println(this);
        return null;
    }
}
