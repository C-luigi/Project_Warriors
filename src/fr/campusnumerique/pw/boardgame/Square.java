package fr.campusnumerique.pw.boardgame;

import fr.campusnumerique.pw.character.Character;
import fr.campusnumerique.pw.character.Magician;
import fr.campusnumerique.pw.character.Warrior;

public abstract class Square {
    public abstract String toString();

    protected void interaction(Character character) {
        if (character instanceof Warrior) {
            System.out.println("Interaction avec un Guerrier !");
        } else if (character instanceof Magician) {
            System.out.println("Interaction avec un Mage !");
        } else {
            System.out.println("Interaction avec un Personnage inconnu !");
        }
    }
}
