package fr.cnalps.pw.game;

import fr.cnalps.pw.boardgame.Board;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.character.Warrior;
import fr.cnalps.pw.database.HeroDatabase;
import fr.cnalps.pw.dice.Dice;
import fr.cnalps.pw.dice.PipeDie;
import fr.cnalps.pw.exception.CharacterOutOfBoardException;
import fr.cnalps.pw.exception.DatabaseException;
import fr.cnalps.pw.exception.MenuException;

/**
 * Represents the core game logic, including the game loop, character movements, and interaction with the board.
 */

public class    Game {

    private Board board;
    private Character character;
    private Dice dice;

    /**
     * Initializes a new game instance with default state.
     */

    public Game(){
        this.board = null;
        this.character = null;
        this.dice = null;
    }

    /**
     * Initializes the game by setting up the character and the menu options.
     *
     * @throws MenuException If there's an error while initializing or processing the game's menu.
     */

    public void gameInitialisation() throws MenuException {
        Menu menu = new Menu();
        this.character = new Warrior();
        boolean onOff = true;
        while (onOff) {
            menu.printOption();
            int option = menu.readInputInt();
            if (option == 0) {
                character = menu.createCharacter();
            }
            else if (option == 1) {
                character = menu.choiceCharacter();
            }
            else if (option == 2) {
                try {
                    HeroDatabase.closeConnection();
                } catch (DatabaseException e) {
                    throw new RuntimeException(e);
                }
                startGame();
            }
            else if (option == 3) {
                onOff = false;
            }
            else {
                System.out.println("Invalid option. Please try again");
            }
        }
    }

    /**
     * Starts the main game loop, allowing the player to make decisions, move, and view stats.
     */

    public void startGame(){
        System.out.println("The game has started");
        Menu menu = new Menu();
        this.dice = new PipeDie();
        this.board = new Board(character);
        while (true) {
            System.out.println(
                    "Please selection option :" + '\n' +
                            "1. Roll dice" + '\n' +
                            "2. See stats");
            int option = menu.readInputInt();
            if (option == 1){
                try {
                    move();
                    System.out.println(character.toString() + '\n' + " is now at square " + board.getPlayerPosition() + " / " + board.getBoardSize());
                } catch (CharacterOutOfBoardException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Congratulations to you! You've reached the end of the board!");
                    System.out.println("Would you like to start the game again ? \r\n 1: Yes 2: No");
                    option = menu.readInputInt();
                    if (option == 1) {
                        board.setPlayerPosition(0);
                        System.out.println("The game restart");
                    }
                    else if (option == 2){
                        System.out.println("Thank you for playing");
                        break;
                    }
                    else {
                        System.out.println("Invalid option. Please try again");
                    }
                }
            }
            else if (option == 2){
                System.out.println(character.toString());
            }
            else {
                System.out.println("Invalid option. Please try again");
            }
        }
    }

    /**
     * Moves the character based on the roll of the dice.
     *
     * @throws CharacterOutOfBoardException If the character moves out of the board.
     */

    public void move() throws CharacterOutOfBoardException {
        int steps = dice.roll();
        System.out.println("You rolled a " + steps);

        if (board.getPlayerPosition() + steps >= board.getBoardSize()) {
            throw new CharacterOutOfBoardException("The character has moved out off board");
        } else {
            board.movePlayer(steps);
        }
    }
}