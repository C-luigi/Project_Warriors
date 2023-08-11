package fr.campusnumerique.pw.character;

import fr.campusnumerique.pw.boardgame.Square;

import java.util.ArrayList;

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

    public void listDefaultWeapon(){
        ArrayList<Weapon> listWeapon = new ArrayList<>();
        listWeapon.add(new Weapon("Sledgehammer",3));
        listWeapon.add(new Weapon("Sword",5));
    }

    public String toString() {
        return "Equipment:" + '\n' +
                "Weapon : " + nameWeapon + '\n' +
                "damage Points = " + damagePoints +  '\n' +
                "Shield : " + shield;
    }
}
