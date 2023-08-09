import fr.campusnumerique.pw.dice.Dice;

public class Game {

    private final int boardSize;
    private final String character;
    private int currentPosition;
    private final Dice dice;

    public Game(int boardSize, String character, Dice dice) {
        this.boardSize = boardSize;
        this.character = character;
        this.currentPosition = 1;
        this.dice = dice;
    }


    public void move() throws CharacterOutOfBoardException {
        int steps = dice.roll();
        System.out.println("You rolled a " + steps);
        this.currentPosition += steps;
        if (this.currentPosition >= boardSize) {
            throw new CharacterOutOfBoardException("The character has moved off the board");
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
                System.out.println(character + " is now at square " + currentPosition + " / " + boardSize);
            } catch (CharacterOutOfBoardException e) {
                System.out.println(e.getMessage());
                System.out.println("Congratulations to you! You've reached the end of the board!");
                System.out.println("Would you like to start the game again ? \r\n 1: Yes 2: No");
                int option = menu.readInputInt();
                if (option == 1) {
                    currentPosition = 1;
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