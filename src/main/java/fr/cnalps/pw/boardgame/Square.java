package fr.cnalps.pw.boardgame;

import fr.cnalps.pw.character.Character;

public abstract class Square {
    public abstract String toString();

    public abstract Square interaction(Character character);
}
