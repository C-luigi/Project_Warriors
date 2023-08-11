package fr.campusnumerique.pw.boardgame.enemy.enemytype;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.character.Character;

public class Wizard extends Enemy{
    public Wizard() {
        super("Wizard", 9, 2);
    }

    @Override
    public Square interaction(Character character) {
        System.out.println("COMBAT!!!");
        return null;
    }
}
