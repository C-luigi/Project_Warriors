package fr.campusnumerique.pw.boardgame;

public class Spell {
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

    public String toString() {
        return "Equipment:" + '\n' +
                "fr.campusnumerique.pw.boardgame.Spell name : " + nameSpell + '\n' +
                "damage Points = " + damagePoints +  '\n' +
                "Philtre : " + philtre;
    }
}
