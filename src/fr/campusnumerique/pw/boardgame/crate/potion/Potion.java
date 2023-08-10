package fr.campusnumerique.pw.boardgame.crate.potion;

public abstract class Potion {
    private final String name;
    private final int stat;

    public Potion(String name, int stat){
        this.name = name;
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Potion : " + name + '\n' +
                "stat = " + stat;
    }
}
