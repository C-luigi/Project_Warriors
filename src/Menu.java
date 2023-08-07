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

    public String createCharacter(){
        System.out.println("What type of character would you like to create? \r\n 1: Warrior 2: Magician");
        int characterType = this.readOption();
        String characterSheet = "";

        if (characterType == 1) {
            Warrior character = this.createWarrior();
            character.setWeapon(this.createWeapon());
            characterSheet = handleCharacterSheet(character);
        }
        else if (characterType == 2) {
            Magician character = this.createMagician();
            character.setSpell(this.createSpell());
            characterSheet = handleCharacterSheet(character);
        }
        else {
            System.out.println("Invalid option. Please try again");
        }
        return characterSheet;
    }

    public String handleCharacterSheet(Warrior character) {
        System.out.println(character.getClass().getSimpleName() + " created !!!");
        System.out.println("Would you like to see the character sheet ? \r\n 1:Yes 2:No 3:Modify");
        int seeSheet = this.readOption();
        String characterSheet = character.toString();

        if (seeSheet == 1 || seeSheet == 2) {
            System.out.println(characterSheet);
        } else if (seeSheet == 3) {
            System.out.println("Modification feature is under construction");
        }

        return characterSheet;
    }

    public String handleCharacterSheet(Magician character) {
        System.out.println(character.getClass().getSimpleName() + " created !!!");
        System.out.println("Would you like to see the character sheet ? \r\n 1:Yes 2:No 3:Modify");
        int seeSheet = this.readOption();
        String characterSheet = character.toString();

        if (seeSheet == 1 || seeSheet == 2) {
            System.out.println(characterSheet);
        } else if (seeSheet == 3) {
            System.out.println("Modification feature is under construction");
        }

        return characterSheet;
    }

    public Warrior createWarrior() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Warrior:");
        String name = scanner.nextLine();
        System.out.println("Enter the Warrior's standard of living:");
        int healthPoints = scanner.nextInt();
        System.out.println("Enter the Warrior's attack strength:");
        int strongPoints = scanner.nextInt();

        return new Warrior(name, healthPoints, strongPoints, new Weapon("fist",0));
    }

    public Magician createMagician() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Magician:");
        String name = scanner.nextLine();
        System.out.println("Enter the Magician's standard of living:");
        int healthPoints = scanner.nextInt();
        System.out.println("Enter the Magician's attack strength:");
        int strongPoints = scanner.nextInt();

        return new Magician(name, healthPoints, strongPoints, new Spell("fist",0));
    }

    public Weapon createWeapon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of weapon :");
        String nameWeapon = scanner.nextLine();
        System.out.println("Enter the damage of weapon :");
        int damagePoints = scanner.nextInt();

        return new Weapon(nameWeapon, damagePoints);
    }

    public Spell createSpell() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of spell :");
        String nameSpell = scanner.nextLine();
        System.out.println("Enter the damage of spell :");
        int damagePoints = scanner.nextInt();

        return new Spell(nameSpell, damagePoints);
    }
}