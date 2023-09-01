package fr.cnalps.pw.boardgame.crate.potion.healthpotion;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.potion.Potion;
import fr.cnalps.pw.character.Character;

public class SmallHealPotion extends Potion {
    public SmallHealPotion() {
        super("Light healing potion", 2);
    }

    @Override
    public Square interaction(Character character) {
        System.out.println(this);
        return null;
    }
}
