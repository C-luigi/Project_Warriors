package fr.campusnumerique.pw.boardgame;

public class Weapon {
    protected String nameWeapon;
    protected int damagePoints;

    protected String shield;

    public Weapon(String nameWeapon, int damagePoints) {
        this.nameWeapon = nameWeapon;
        this.damagePoints = damagePoints;
        this.shield = "grass crest shield";
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }


    public String toString() {
        return "Equipment:" + '\n' +
                "fr.campusnumerique.pw.boardgame.Weapon name : " + nameWeapon + '\n' +
                "damage Points = " + damagePoints +  '\n' +
                "Shield : " + shield;
    }
}
