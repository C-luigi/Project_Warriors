package fr.cnalps.pw.boardgame.enemy.enemytype;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.character.Character;

public class Goblin extends Enemy{
    public Goblin() {
        super("Goblin", 6, 1);
    }

    @Override
    public Square interaction(Character character) {
        System.out.println("COMBAT!!!");
        return null;
    }
}
