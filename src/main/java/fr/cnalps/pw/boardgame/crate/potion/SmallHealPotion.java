package fr.cnalps.pw.boardgame.crate.potion;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.Potion;
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
