package fr.cnalps.pw.boardgame.enemy.enemytype;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.character.Character;

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
