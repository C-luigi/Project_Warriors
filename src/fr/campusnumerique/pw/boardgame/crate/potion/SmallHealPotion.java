package fr.campusnumerique.pw.boardgame.crate.potion;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.boardgame.crate.Potion;
import fr.campusnumerique.pw.character.Character;

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
