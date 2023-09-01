package fr.cnalps.pw.boardgame.crate.potion.healthpotion;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.potion.Potion;
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
