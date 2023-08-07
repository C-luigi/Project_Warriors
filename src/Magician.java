public class Magician extends Character {
    private Spell spell;

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
