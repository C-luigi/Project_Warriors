package fr.campusnumerique.pw.character;
import fr.campusnumerique.pw.boardgame.Weapon;

public class Warrior extends Character {
    private Weapon weapon;

    public Warrior() {
        super();
        this.weapon = new Weapon("sword",2);
    }

    public Warrior(String name) {
        super(name);
        this.weapon = new Weapon("sword",2);
    }

    public Warrior(String name, int healthPoints, int strongPoints, Weapon weapon) {
        super(name, healthPoints, strongPoints);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + weapon;
    }
}