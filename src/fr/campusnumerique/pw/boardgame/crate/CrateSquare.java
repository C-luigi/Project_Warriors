package fr.campusnumerique.pw.boardgame.crate;

import fr.campusnumerique.pw.boardgame.Square;
import fr.campusnumerique.pw.boardgame.crate.equipment.*;
import fr.campusnumerique.pw.boardgame.crate.potion.GreatHealPotion;
import fr.campusnumerique.pw.boardgame.crate.potion.Potion;
import fr.campusnumerique.pw.boardgame.crate.potion.SmallHealPotion;

import java.util.Random;
import java.util.ArrayList;
import java.util.function.Supplier;

public class CrateSquare extends Square {
    private final Potion potion;
    private final Equipment equipment;

    public CrateSquare() {
        Random random = new Random();
        if (random.nextBoolean()) {
            this.potion = getRandomPotion();
            this.equipment = null;
        } else {
            this.potion = null;
            this.equipment = getRandomEquipment();
        }
    }

    private Potion getRandomPotion() {
        Random random = new Random();

        ArrayList<Supplier<Potion>> potionTypes = new ArrayList<>();
        potionTypes.add(GreatHealPotion::new);
        potionTypes.add(SmallHealPotion::new);

        int randomIndex = random.nextInt(potionTypes.size());
        return potionTypes.get(randomIndex).get();
    }

    public Equipment getRandomEquipment() {
        Random random = new Random();

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

}
