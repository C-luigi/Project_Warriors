public class Warrior extends Character {
    private Weapon weapon;

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