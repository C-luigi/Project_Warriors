public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean onOff = true;
        String character = "";
        while (onOff) {
            menu.printOption();
            int option = menu.readOption();
            if (option == 1) {
                character = menu.createCharacter();
            }
            else if (option == 2) {
                Game game = new Game(64);
                game.startGame(character);
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