package fr.campusnumerique.pw.boardgame;

import java.util.ArrayList;

public class EnemySquare extends Square {
    private final String typeEnemy;
    private final int healthPointEnemy;
    private final int strongPointEnemy;

    public EnemySquare(String typeEnemy, int healthPointEnemy, int strongPointEnemy){
        this.typeEnemy = typeEnemy;
        this.healthPointEnemy = healthPointEnemy;
        this.strongPointEnemy = strongPointEnemy;
    }

    public void listEnemy(){
        ArrayList<EnemySquare> listEnemy = new ArrayList<>();
        listEnemy.add(new EnemySquare("Goblin",6,1));
        listEnemy.add(new EnemySquare("Wizard",9,2));
        listEnemy.add(new EnemySquare("Dragon",15,4));
    }

    public String toString() {
        return "Enemy :" + '\n' +
                "Type : " + typeEnemy + '\n' +
                "HealthPoints = " + healthPointEnemy +  '\n' +
                "StrongPoints = " + strongPointEnemy;
    }

}
