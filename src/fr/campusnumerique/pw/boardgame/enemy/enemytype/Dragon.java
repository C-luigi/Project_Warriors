package fr.campusnumerique.pw.boardgame.enemy.enemytype;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.character.Character;

public class Dragon extends Enemy{
    public Dragon() {
        super("Dragon", 15, 4);
    }

    @Override
    public Square interaction(Character character) {
        System.out.println("COMBAT!!!");
        return null;
    }
}
