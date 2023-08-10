package fr.campusnumerique.pw.boardgame.crate.equipment;

public abstract class Equipment {
    private final String name;
    private final int stat;

    public Equipment(String name, int stat){
        this.name = name;
        this.stat = stat;
    }

    @Override
    public String toString() {
        return "Equipment:" + '\n' +
                "Type : " + name + '\n' +
                "stat = " + stat;
    }
}