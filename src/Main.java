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
                if (character.equals("")) {
                    System.out.println("please create a character");
                }
                else {
                    Game game = new Game(64, character);
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