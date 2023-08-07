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
            int seeSheet;
            String characterSheet = character.toString();
            do {
                System.out.println(character.getClass().getSimpleName() + " created !!!");
                System.out.println("Would you like to see the character sheet ? \r\n 1:Yes 2:No 3:Modify");
                seeSheet = this.readOption();
                characterSheet = character.toString();
                if (seeSheet == 1 || seeSheet == 3) {
                    if (seeSheet == 1) {
                        System.out.println(characterSheet);
                    } else {
                        modifyCharacter(character);
                    }
                } else if (seeSheet != 2) {
                    System.out.println("Invalid option. Please try again");
                }
            } while (seeSheet != 2);
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
            if (healthPoints < 5 || healthPoints > 10) {
                System.out.println("Invalid input! Please enter a value between 5 and 10.");
            }
        }
        int strongPoints = 0;
        System.out.println("Enter the Warrior attack strength (between 5 and 10):");
        while (strongPoints < 5 || strongPoints > 10) {
            strongPoints = scanner.nextInt();
            if (strongPoints < 5 || strongPoints > 10) {
                System.out.println("Invalid input! Please enter a value between 5 and 10.");
            }}

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
            if (healthPoints < 3 || healthPoints > 6) {
                System.out.println("Invalid input! Please enter a value between 3 and 6.");
            }
        }
        int strongPoints = 0;
        System.out.println("Enter the Magician attack strength (between 8 and 15):");
        while (strongPoints < 8 || strongPoints > 15) {
            strongPoints = scanner.nextInt();
            if (strongPoints < 8 || strongPoints > 15) {
                System.out.println("Invalid input! Please enter a value between 8 and 15.");
            }
        }

        return new Magician(name, healthPoints, strongPoints, new Spell("fist",0));
    }

    public void modifyCharacter(Object character) {
        if (character instanceof Warrior) {
            modifyWarrior((Warrior) character);
        } else if (character instanceof Magician) {
            modifyMagician((Magician) character);
        } else {
            System.out.println("Unknown character type.");
        }
    }

    public void modifyWarrior(Warrior warrior) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to modify?");
        System.out.println("1. Name");
        System.out.println("2. Standard of Living");
        System.out.println("3. Attack Strength");
        System.out.println("4. Weapon");

        int option = scanner.nextInt();
        switch(option) {
            case 1:
                System.out.println("Enter the new name:");
                warrior.setName(scanner.next());
                break;
            case 2:
                System.out.println("Enter the new standard of living:");
                warrior.setHealthPoints(scanner.nextInt());
                break;
            case 3:
                System.out.println("Enter the new attack strength:");
                warrior.setStrongPoints(scanner.nextInt());
                break;
            case 4:
                System.out.println("Enter the new weapon:");
                warrior.setWeapon(createWeapon());
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

    public void modifyMagician(Magician magician) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to modify?");
        System.out.println("1. Name");
        System.out.println("2. Standard of Living");
        System.out.println("3. Attack Strength");
        System.out.println("4. Spell");

        int option = scanner.nextInt();
        switch(option) {
            case 1:
                System.out.println("Enter the new name:");
                magician.setName(scanner.next());
                break;
            case 2:
                System.out.println("Enter the new standard of living:");
                magician.setHealthPoints(scanner.nextInt());
                break;
            case 3:
                System.out.println("Enter the new attack strength:");
                magician.setStrongPoints(scanner.nextInt());
                break;
            case 4:
                System.out.println("Enter the new spell:");
                magician.setSpell(createSpell());
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
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