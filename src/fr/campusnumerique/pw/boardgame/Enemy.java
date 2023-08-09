package fr.campusnumerique.pw.boardgame;

import java.util.ArrayList;

public class Enemy extends Case{
    private final String typeEnemy;
    private final int healthPointEnemy;
    private final int strongPointEnemy;

    public Enemy(String typeEnemy, int healthPointEnemy, int strongPointEnemy){
        this.typeEnemy = typeEnemy;
        this.healthPointEnemy = healthPointEnemy;
        this.strongPointEnemy = strongPointEnemy;
    }

    public void listEnemy(){
        ArrayList<Enemy> listEnemy = new ArrayList<>();
        listEnemy.add(new Enemy("Goblin",6,1));
        listEnemy.add(new Enemy("Wizard",9,2));
        listEnemy.add(new Enemy("Dragon",15,4));
    }

    public String toString() {
        return "Enemy :" + '\n' +
                "Type : " + typeEnemy + '\n' +
                "HealthPoints = " + healthPointEnemy +  '\n' +
                "StrongPoints = " + strongPointEnemy;
    }

}
