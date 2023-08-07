import java.util.Scanner;

public class Menu {
    private final Scanner scanner;

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

    public String handleCharacterSheet(Object character) {
        if (character instanceof Warrior || character instanceof Magician) {
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
        else{
            return "Unknown character type.";
        }
    }

    public Warrior createWarrior() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Warrior:");
        String name = scanner.nextLine();
        int healthPoints = 0;
        System.out.println("Enter the Warrior standard of living (between 5 and 10):");
        while (healthPoints < 5 || healthPoints > 10) {
            healthPoints = scanner.nextInt();
            System.out.println("Invalid input! Please enter a value between 5 and 10.");
        }
        int strongPoints = 0;
        System.out.println("Enter the Warrior attack strength (between 5 and 10):");
        while (strongPoints < 5 || strongPoints > 10) {
            strongPoints = scanner.nextInt();
            System.out.println("Invalid input! Please enter a value between 5 and 10.");
        }

        return new Warrior(name, healthPoints, strongPoints, new Weapon("fist",0));
    }

    public Magician createMagician() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Magician:");
        String name = scanner.nextLine();
        int healthPoints = 0;
        System.out.println("Enter the Magician standard of living (between 3 and 6):");
        while (healthPoints < 3 || healthPoints > 6) {
            healthPoints = scanner.nextInt();
            System.out.println("Invalid input! Please enter a value between 3 and 6.");
        }
        int strongPoints = 0;
        System.out.println("Enter the Magician attack strength (between 8 and 15):");
        while (strongPoints < 8 || strongPoints > 15) {
            strongPoints = scanner.nextInt();
            System.out.println("Invalid input! Please enter a value between 8 and 15.");
        }

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