package fr.cnalps.pw.boardgame;

import fr.cnalps.pw.boardgame.crate.equipment.magicianequipment.FireBall;
import fr.cnalps.pw.boardgame.crate.equipment.magicianequipment.Lightning;
import fr.cnalps.pw.boardgame.crate.potion.healthpotion.GreatHealPotion;
import fr.cnalps.pw.boardgame.crate.potion.healthpotion.SmallHealPotion;
import fr.cnalps.pw.boardgame.crate.equipment.warriorequipment.Sledgehammer;
import fr.cnalps.pw.boardgame.crate.equipment.warriorequipment.Sword;
import fr.cnalps.pw.boardgame.enemy.enemytype.Dragon;
import fr.cnalps.pw.boardgame.enemy.enemytype.Goblin;
import fr.cnalps.pw.boardgame.enemy.enemytype.Wizard;

import java.util.ArrayList;

/**
 * Represents the game board which is a collection of squares.
 * The board has various types of squares, including enemies, equipment, and empty spaces.
 * A player (character) can move around the board, interacting with each square based on its type.
 */

public class Board {
    private final ArrayList<Square> cases;
    private int playerPosition;

    /**
     * Constructs the game board with a predefined set of squares.
     * The initial player position is set to 0 (start of the board).
     *
     */

    public Board() {
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

    /**
     * Updates the player's position on the board.
     *
     * @param playerPosition The new position of the player on the board.
     */

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    /**
     * Retrieves the total number of squares on the board.
     *
     * @return The size of the board, i.e., the number of squares.
     */

    public int getBoardSize() {
        return cases.size();
    }

    /**
     * Moves the player by a specified number of steps.
     * Displays the description of the square where the player lands.
     *
     * @param steps The number of steps the player should move.
     */

    public void movePlayer(int steps) {
        playerPosition = (playerPosition + steps) % cases.size();
        System.out.println(cases.get(playerPosition).toString());
    }

    /**
     * Retrieves the current position of the player on the board.
     *
     * @return The player's current position.
     */

    public int getPlayerPosition() {
        return playerPosition;
    }
}
