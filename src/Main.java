import fr.campusnumerique.pw.dice.Dice;
import fr.campusnumerique.pw.dice.DieEightFace;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean onOff = true;
        String character = "";
        while (onOff) {
            menu.printOption();
            int option = menu.readInputInt();
            if (option == 1) {
                character = menu.createCharacter();
            }
            else if (option == 2) {
                if (character.isEmpty()) {
                    System.out.println("please create a character");
                }
                else {
                    Dice dice = new DieEightFace();
                    Game game = new Game(64, character,dice);
                    game.startGame();
                }
            }
            else if (option == 3) {
                onOff = false;
            }
            else {
                System.out.println("Invalid option. Please try again");
            }
        }
    }
}