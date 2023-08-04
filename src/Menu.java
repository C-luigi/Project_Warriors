import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void printOption() {
        System.out.println("1. Create a new character");
        System.out.println("2. left the game");
    }

    public int readOption() {
        return scanner.nextInt();
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
}
