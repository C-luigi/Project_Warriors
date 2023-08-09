import fr.campusnumerique.pw.boardgame.Board;
import fr.campusnumerique.pw.dice.Dice;

public class Game {

    private final Board board;
    private final String character;
    private final Dice dice;

    public Game(Board board, String character, Dice dice) {
        this.board = board;
        this.character = character;
        this.dice = dice;
    }


    public void move() throws CharacterOutOfBoardException {
        int steps = dice.roll();
        System.out.println("You rolled a " + steps);

        if (board.getPlayerPosition() + steps >= board.getBoardSize()) {
            throw new CharacterOutOfBoardException("The character has moved off the board");
        } else {
            board.movePlayer(steps);
        }
    }

    public void startGame(){
        System.out.println("Le jeux commence");
        Menu menu = new Menu();
        while (true) {
            System.out.println("Press any touch and press enter for play");
            menu.readInputString();
            try {
                move();
                System.out.println(character + '\n' + " is now at square " + board.getPlayerPosition() + " / " + board.getBoardSize());
            } catch (CharacterOutOfBoardException e) {
                System.out.println(e.getMessage());
                System.out.println("Congratulations to you! You've reached the end of the board!");
                System.out.println("Would you like to start the game again ? \r\n 1: Yes 2: No");
                int option = menu.readInputInt();
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
    }
}