package fr.cnalps.pw.boardgame.crate;

import fr.cnalps.pw.boardgame.Square;
import fr.cnalps.pw.boardgame.crate.magicianequipment.FireBall;
import fr.cnalps.pw.boardgame.crate.magicianequipment.Lightning;
import fr.cnalps.pw.character.Character;
import fr.cnalps.pw.boardgame.crate.potion.GreatHealPotion;
import fr.cnalps.pw.boardgame.crate.potion.SmallHealPotion;
import fr.cnalps.pw.boardgame.crate.warriorequipment.Sledgehammer;
import fr.cnalps.pw.boardgame.crate.warriorequipment.Sword;

import java.util.Random;
import java.util.ArrayList;
import java.util.function.Supplier;

public class CrateSquare extends Square {
    private final Potion potion;
    private final Equipment equipment;

    private static final Random random = new Random();

    public CrateSquare() {
        if (random.nextBoolean()) {
            this.potion = getRandomPotion();
            this.equipment = null;
        } else {
            this.potion = null;
            this.equipment = getRandomEquipment();
        }
    }

    private Potion getRandomPotion() {

        ArrayList<Supplier<Potion>> potionTypes = new ArrayList<>();
        potionTypes.add(GreatHealPotion::new);
        potionTypes.add(SmallHealPotion::new);

        int randomIndex = random.nextInt(potionTypes.size());
        return potionTypes.get(randomIndex).get();
    }

    public Equipment getRandomEquipment() {

        ArrayList<Supplier<Equipment>> equipmentTypes = new ArrayList<>();
        equipmentTypes.add(FireBall::new);
        equipmentTypes.add(Lightning::new);
        equipmentTypes.add(Sledgehammer::new);
        equipmentTypes.add(Sword::new);

        int randomIndex = random.nextInt(equipmentTypes.size());
        return equipmentTypes.get(randomIndex).get();
    }

    @Override
    public String toString() {
        if (potion == null){
            return equipment.toString();
        }
        else {
            return potion.toString();
        }
    }

    @Override
    public Square interaction(Character character) {

        return null;
    }

}