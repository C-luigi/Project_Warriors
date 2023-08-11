package fr.campusnumerique.pw.boardgame;

import fr.campusnumerique.pw.character.Character;
import fr.campusnumerique.pw.boardgame.crate.magicianequipment.*;
import fr.campusnumerique.pw.boardgame.crate.warriorequipment.*;
import fr.campusnumerique.pw.boardgame.crate.potion.*;
import fr.campusnumerique.pw.boardgame.enemy.enemytype.*;

import java.util.ArrayList;

public class Board {
    private final ArrayList<Square> cases;
    private int playerPosition;

    public Board(Character character) {
        this.cases = new ArrayList<>();
        cases.add(new EmptySquare());
        cases.add(new Dragon());
        cases.add(new Wizard());
        cases.add(new Goblin());
        cases.add(new Sledgehammer());
        cases.add(new Sword());
        cases.add(new Lightning());
        cases.add(new FireBall());
        cases.add(new SmallHealPotion());
        cases.add(new GreatHealPotion());
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
