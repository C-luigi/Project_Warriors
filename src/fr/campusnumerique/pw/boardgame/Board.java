package fr.campusnumerique.pw.boardgame;

import java.util.ArrayList;

public class Board {
    private final ArrayList<Case> cases;
    private int playerPosition;

    public Board() {
        this.cases = new ArrayList<>();
        cases.add(new EmptyCase());
        cases.add(new Enemy("Goblin",10,10));
        cases.add(new Weapon("Sword",10));
        cases.add(new Potion("heal",10));
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
