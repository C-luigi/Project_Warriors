import fr.cnalps.pw.exception.MenuException;
import fr.cnalps.pw.game.Game;

/**
 * Main entry point for the game.
 */

public class Main {

    /**
     * The main method, which is the entry point for the application.
     *
     * @param args Command line arguments passed to the program.
     * @throws MenuException If there is an error loading the menu.
     */

    public static void main(String[] args) throws MenuException {
        Game game = new Game();
        try {
            game.gameInitialisation();
        } catch (MenuException e) {
            throw new MenuException("error loading game", e);
        }
    }
}