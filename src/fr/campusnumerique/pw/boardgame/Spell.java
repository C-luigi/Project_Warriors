package fr.campusnumerique.pw.boardgame;

import java.util.ArrayList;

public class Spell extends Square {
    protected String nameSpell;
    protected int damagePoints;
    protected String philtre;
    public Spell(String nameSpell, int damagePoints) {
        this.nameSpell = nameSpell;
        this.damagePoints = damagePoints;
        this.philtre = "Bitos mana potion";
    }

    public String getNameSpell() {
        return nameSpell;
    }

    public void setNameSpell(String nameSpell) {
        this.nameSpell = nameSpell;
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public void listDefaultSpell(){
        ArrayList<Spell> listSpell = new ArrayList<>();
        listSpell.add(new Spell("Lightning",3));
        listSpell.add(new Spell("Fire ball",5));
    }

    public String toString() {
        return "Equipment:" + '\n' +
                "name : " + nameSpell + '\n' +
                "damage Points = " + damagePoints +  '\n' +
                "Philtre : " + philtre;
    }
}
