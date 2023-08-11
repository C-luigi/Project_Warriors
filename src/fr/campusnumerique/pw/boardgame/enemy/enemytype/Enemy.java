package fr.campusnumerique.pw.boardgame.enemy.enemytype;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.character.Character;

public abstract class Enemy extends Square {
    private final String typeEnemy;
    private final int healthPointEnemy;
    private final int strongPointEnemy;

    public Enemy(String typeEnemy, int healthPointEnemy, int strongPointEnemy){
        this.typeEnemy = typeEnemy;
        this.healthPointEnemy = healthPointEnemy;
        this.strongPointEnemy = strongPointEnemy;
    }

    @Override
    public String toString() {
        return "Enemy !!!" + '\n' +
                typeEnemy +
                "; HP = " + healthPointEnemy +
                "; SP = " + strongPointEnemy;
    }

}
