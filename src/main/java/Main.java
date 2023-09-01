import fr.cnalps.pw.exception.MenuException;
import fr.cnalps.pw.game.Game;

public class Main {
    public static void main(String[] args) throws MenuException {
        Game game = new Game();
        try {
            game.gameInitialisation();
        } catch (MenuException e) {
            throw new MenuException("Error fetching heroes from database", e);
        }
    }
}