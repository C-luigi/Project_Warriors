package fr.campusnumerique.pw.boardgame.enemy;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.boardgame.enemy.enemytype.*;
import fr.campusnumerique.pw.character.Character;

import java.util.Random;
import java.util.ArrayList;
import java.util.function.Supplier;


public class EnemySquare extends Square {
    private final Enemy enemy;
    private static final Random random = new Random();

    public EnemySquare(){
        this.enemy = getRandomEnemy();
    }

    public Enemy getRandomEnemy() {

        ArrayList<Supplier<Enemy>> enemyTypes = new ArrayList<>();
        enemyTypes.add(Dragon::new);
        enemyTypes.add(Wizard::new);
        enemyTypes.add(Goblin::new);

        int randomIndex = random.nextInt(enemyTypes.size());
        return enemyTypes.get(randomIndex).get();
    }

    @Override
    public String toString() {
        return enemy.toString();
    }

    @Override
    public Square interaction(Character character) {

        return null;
    }

}
