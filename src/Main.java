import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean onOff = true;
        System.out.println("Hi world");
        Menu menu = new Menu();

        while (onOff) {
            menu.printOption();
            int option = menu.readOption();

            if (option == 1) {
                System.out.println("What type of character would you like to create? \r\n 1: Warrior 2: Magician");
                int characterType = menu.readOption();
                if (characterType == 1) {
                    Warrior character = menu.createWarrior();
                    System.out.println("Warrior created !!!");
                    System.out.println("Would you like to see your stats ? \r\n 1:Yes 2:No");
                    int seeinfo = menu.readOption();
                    if (seeinfo == 1){
                        System.out.println(character.toString());
                    } else if (seeinfo == 2) {
                        onOff = false;
                    }
                } else if (characterType == 2) {
                    Magician character = menu.createMagician();
                    System.out.println("Magician created !!!");
                    System.out.println("Would you like to see your stats ? \r\n 1:Yes 2:No 3:Modify");
                    int seeinfo = menu.readOption();
                    if (seeinfo == 1){
                        System.out.println(character.toString());
                    } else if (seeinfo == 2) {
                        onOff = false;
                    } else if (seeinfo == 3) {
                        System.out.println("modfier en cours de fabrication");
                    }
                } else {
                    System.out.println("Invalid option. Please try again");
                }
            }
            else if (option == 2) {
                onOff = false;
            }
            else {
                System.out.println("Invalid option. Please try again");
            }
        }
    }
}