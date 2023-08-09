package fr.campusnumerique.pw.boardgame;

import java.util.ArrayList;

public class Potion extends Case{
    private final String namePotion;
    private final int regainValue;

    public Potion(String namePotion, int regainValue){
        this.namePotion = namePotion;
        this.regainValue = regainValue;
    }

    public void listPotion(){
        ArrayList<Potion> listPotion = new ArrayList<>();
        listPotion.add(new Potion("Light healing potion",2));
        listPotion.add(new Potion("Healing potion with major effect",5));
    }

    public String toString() {
        return "Potion :" + '\n' +
                "Name : " + namePotion + '\n' +
                "Regain value = " + regainValue;
    }

}
