package fr.campusnumerique.pw.boardgame;

import fr.campusnumerique.pw.boardgame.crate.CrateSquare;
import fr.campusnumerique.pw.boardgame.enemy.EnemySquare;

import java.util.ArrayList;

public class Board {
    private final ArrayList<Square> cases;
    private int playerPosition;

    public Board() {
        this.cases = new ArrayList<>();
        cases.add(new EmptySquare());
        cases.add(new EnemySquare());
        cases.add(new EnemySquare());
        cases.add(new EnemySquare());
        cases.add(new CrateSquare());
        this.playerPosition = 0;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getBoardSize() {
        return cases.size();
    }

    public void movePlayer(int steps) {
        playerPosition = (playerPosition + steps) % cases.size();
        System.out.println(cases.get(playerPosition).toString());
    }

    public int getPlayerPosition() {
        return playerPosition;
    }
}
