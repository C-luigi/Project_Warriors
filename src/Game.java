import java.util.Random;
public class Game {

    private int boardSize;

    public Game(int boardSize) {
        this.boardSize = boardSize;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public int roll(){
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1;
        return roll;
    }

    public void startGame(String character){
        System.out.println("Le jeux commence");
        System.out.println("Your sheet :" + character);

    }

}