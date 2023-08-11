package fr.campusnumerique.pw.boardgame.enemy.enemytype;

import fr.campusnumerique.pw.character.Character;

public class Goblin extends Enemy{
    public Goblin() {
        super("Goblin", 6, 1);
    }

    @Override
    public void interaction(Character character) {
        System.out.println("COMBAT!!!");
    }
}
