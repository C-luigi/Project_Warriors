import java.util.Random;
public class Game {

    private int boardSize;
    private String character;
    private int currentPosition;

    public Game(int boardSize, String character) {
        this.boardSize = boardSize;
        this.character = character;
        this.currentPosition = 1;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public int roll(){
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        return roll;
    }

    public void move(int steps) {
        this.currentPosition += steps;
        if (this.currentPosition > boardSize) {
            this.currentPosition = boardSize;
        }
    }

    public void startGame(){
        System.out.println("Le jeux commence");
        Menu menu = new Menu();
        while (true) {
            System.out.println("Press enter for play");
            int captureInput = menu.readOption();
            int roll = roll();
            System.out.println("You rolled a " + roll);
            move(roll);
            System.out.println(character + " is now at square " + currentPosition + " / " + boardSize);
            if (currentPosition == boardSize) {
                System.out.println("Congratulations to you! You've reached the end of the board!");
                System.out.println("Would you like to start the game again ? \r\n 1: Yes 2: No");
                int option = menu.readOption();
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