import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean onOff = true;
        while (onOff) {
            menu.printOption();
            int option = menu.readOption();
            if (option == 1) {
                menu.createCharacter();
            }
            else if (option == 2) {
                System.out.println("ça arrive");
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