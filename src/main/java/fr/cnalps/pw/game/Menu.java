package fr.cnalps.pw.game;

import fr.cnalps.pw.boardgame.crate.DefaultFist;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.character.Magician;
import fr.cnalps.pw.character.Warrior;
import fr.cnalps.pw.database.HeroDatabase;
import fr.cnalps.pw.exception.DatabaseException;
import fr.cnalps.pw.exception.MenuException;

import java.util.List;
import java.util.Scanner;

public class Menu {

    /**
     * method which write a menu with 3 option
     */
    public void printOption() {
        System.out.println("1. Choice an character");
        System.out.println("2. start the game");
        System.out.println("3. left the game");
    }

    /**
     * method which read the keyboard input type int
     */
    public int readInputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * method which read the keyboard input type String
     */
    public String readInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    /**
     * method which allows of choice an character retrieved from a database
     */
    public Character choiceCharacter() throws MenuException {
        List<Character> characterList = null;
        try {
            characterList = HeroDatabase.getInstance().getHeroes();
        } catch (DatabaseException e) {
            throw new MenuException("Error fetching heroes from database", e);
        }
        System.out.println("1: Warrior 2: Magician");
        int characterType = this.readInputInt();
        Character character = null ;
        if (characterType == 1) {
            System.out.println( character = characterList.get(0) );
        }
        else if (characterType == 2) {
            System.out.println( character = characterList.get(1) );
        }
        else {
            System.out.println("Invalid option. Please try again");
        }
        return character;
    }

    /**
     * method which allows of create a new character
     */
    public Character createCharacter(){
        System.out.println("1: Warrior 2: Magician");
        int characterType = this.readInputInt();
        Character character = null ;
        if (characterType == 1) {
            character = this.createWarrior();
            character = handleCharacterSheet(character);
        }
        else if (characterType == 2) {
            character = this.createMagician();
            character = handleCharacterSheet(character);
        }
        else {
            System.out.println("Invalid option. Please try again");
        }
        return character;
    }

    public Character handleCharacterSheet(Character character) {
        if (character instanceof Warrior || character instanceof Magician) {
            int seeSheet;
            do {
                System.out.println(character.getClass().getSimpleName() + " created !!!");
                System.out.println("Would you like to see the character sheet ? \r\n 1:Yes 2:No 3:Modify");
                seeSheet = this.readInputInt();
                if (seeSheet == 1 || seeSheet == 3) {
                    if (seeSheet == 1) {
                        System.out.println(character);
                    } else {
                        modifyCharacter(character);
                    }
                } else if (seeSheet != 2) {
                    System.out.println("Invalid option. Please try again");
                }
            } while (seeSheet != 2);
            return character;
        }
        else{
            return null;
        }
    }

    public Warrior createWarrior() {
        System.out.println("Enter the name of Warrior:");
        String name = this.readInputString();
        int healthPoints = 0;
        System.out.println("Enter the Warrior standard of living (between 5 and 10):");
        while (healthPoints < 5 || healthPoints > 10) {
            healthPoints = this.readInputInt();
            if (healthPoints < 5 || healthPoints > 10) {
                System.out.println("Invalid input! Please enter a value between 5 and 10.");
            }
        }
        int strongPoints = 0;
        System.out.println("Enter the Warrior attack strength (between 5 and 10):");
        while (strongPoints < 5 || strongPoints > 10) {
            strongPoints = this.readInputInt();
            if (strongPoints < 5 || strongPoints > 10) {
                System.out.println("Invalid input! Please enter a value between 5 and 10.");
            }}

        return new Warrior(name, healthPoints, strongPoints, new DefaultFist());
    }

    public Magician createMagician() {
        System.out.println("Enter the name of the Magician:");
        String name = this.readInputString();
        int healthPoints = 0;
        System.out.println("Enter the Magician standard of living (between 3 and 6):");
        while (healthPoints < 3 || healthPoints > 6) {
            healthPoints = this.readInputInt();
            if (healthPoints < 3 || healthPoints > 6) {
                System.out.println("Invalid input! Please enter a value between 3 and 6.");
            }
        }
        int strongPoints = 0;
        System.out.println("Enter the Magician attack strength (between 8 and 15):");
        while (strongPoints < 8 || strongPoints > 15) {
            strongPoints = this.readInputInt();
            if (strongPoints < 8 || strongPoints > 15) {
                System.out.println("Invalid input! Please enter a value between 8 and 15.");
            }
        }

        return new Magician(name, healthPoints, strongPoints, new DefaultFist());
    }

    public void modifyCharacter(Character character) {
        System.out.println(
                "What would you like to modify?" + '\n' +
                        "1. Name" + '\n' +
                        "2. Standard of Living" +  '\n' +
                        "3. Attack Strength");

        int option = this.readInputInt();
        switch(option) {
            case 1:
                System.out.println("Enter the new name:");
                character.setName(this.readInputString());
                break;
            case 2:
                System.out.println("Enter the new standard of living:");
                character.setHealthPoints(this.readInputInt());
                break;
            case 3:
                System.out.println("Enter the new attack strength:");
                character.setStrongPoints(this.readInputInt());
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }

}