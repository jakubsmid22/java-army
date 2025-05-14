package org.example.Soldier;

import org.example.Abilities.Abilities;
import org.example.Abilities.Defender;

public class Archer extends Soldier implements Defender {
    public Archer(String name, int damage) {
        super(name, damage, SoldierType.DEFENSIVE);
    }

    @Override
    public void defend() {
        Abilities.defend(this);
    }

    @Override
    public void fireDefend() {
        Abilities.fireDefend(this);
    }
}
