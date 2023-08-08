package fr.campusnumerique.pw.character;
import fr.campusnumerique.pw.boardgame.Spell;

public class Magician extends Character {
    private Spell spell;

    public Magician() {
        super();
        this.spell = new Spell("spark",2);
    }

    public Magician(String name) {
        super(name);
        this.spell = new Spell("spark",2);
    }


    public Magician(String name, int healthPoints, int strongPoints, Spell spell) {
        super(name, healthPoints, strongPoints);
        this.spell = spell;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' + spell;
    }
}
