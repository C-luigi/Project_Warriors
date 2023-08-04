import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void printOption() {
        System.out.println("1. Create a new character");
        System.out.println("2. start the game");
        System.out.println("3. left the game");
    }

    public int readOption() {
        return scanner.nextInt();
    }

    public void createCharacter(){
        boolean onOff;
        System.out.println("What type of character would you like to create? \r\n 1: Warrior 2: Magician");
        int characterType = this.readOption();

        if (characterType == 1) {
            Warrior character = this.createWarrior();
            System.out.println("Warrior created stuff them !!!");
            Weapon actualWeapon = this.createWeapon();
            System.out.println("Stuff created !!!");
            System.out.println("Would you like to see your stats ? \r\n 1:Yes 2:No 3:Modify");
            int seeStats = this.readOption();
            if (seeStats == 1){
                System.out.println(character.toString());
                System.out.println(actualWeapon.toString());
            } else if (seeStats == 2) {
                onOff = false;
            } else if (seeStats == 3) {
                System.out.println("modfier en cours de fabrication");
            }
        }
        else if (characterType == 2) {
            Magician character = this.createMagician();
            System.out.println("Magician created !!!");
            Spell actualWeapon = this.creataSpell();
            System.out.println("Stuff created !!!");
            System.out.println("Would you like to see your stats ? \r\n 1:Yes 2:No 3:Modify");
            int seeStats = this.readOption();
            if (seeStats == 1){
                System.out.println(character.toString());
                System.out.println(actualWeapon.toString());
            } else if (seeStats == 2) {
                onOff = false;
            } else if (seeStats == 3) {
                System.out.println("modfier en cours de fabrication");
            }
        }
        else {
            System.out.println("Invalid option. Please try again");
        }
    }

    public Warrior createWarrior() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Warrior's:");
        String name = scanner.nextLine();
        System.out.println("Enter the Warrior's standard of living:");
        int healthPoints = scanner.nextInt();
        System.out.println("Enter the Warrior's attack strength:");
        int strongPoints = scanner.nextInt();

        return new Warrior(name, healthPoints, strongPoints);
    }

    public Magician createMagician() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Magician:");
        String name = scanner.nextLine();
        System.out.println("Enter the Magician's standard of living:");
        int healthPoints = scanner.nextInt();
        System.out.println("Enter the Magician's attack strength:");
        int strongPoints = scanner.nextInt();

        return new Magician(name, healthPoints, strongPoints);
    }

    public Weapon createWeapon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of weapon :");
        String nameWeapon = scanner.nextLine();
        System.out.println("Enter the damage of weapon :");
        int damagePoints = scanner.nextInt();

        return new Weapon(nameWeapon, damagePoints);
    }

    public Spell creataSpell() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of spell :");
        String nameSpell = scanner.nextLine();
        System.out.println("Enter the damage of spell :");
        int damagePoints = scanner.nextInt();

        return new Spell(nameSpell, damagePoints);
    }

}
