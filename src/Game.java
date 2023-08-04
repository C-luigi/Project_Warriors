public class Game {

    private int boardSize;

    public Game(int boardSize) {
        this.boardSize = boardSize;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void startGame(String character){
        System.out.println("Le jeux commence");
        System.out.println("Your sheet" + character);

    }

}