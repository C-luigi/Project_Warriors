package fr.campusnumerique.pw.boardgame;

import fr.campusnumerique.pw.character.Character;

public abstract class Square {
    public abstract String toString();

    public abstract void interaction(Character character);
}
