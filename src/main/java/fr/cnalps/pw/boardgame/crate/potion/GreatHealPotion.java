package fr.cnalps.pw.boardgame.crate.potion;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.Potion;
import fr.cnalps.pw.character.Character;

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
