package org.example.Soldier;

import org.example.Abilities.Abilities;
import org.example.Abilities.Attacker;
import org.example.Abilities.Flanker;

public class Knight extends Soldier implements Attacker, Flanker {
    public Knight(String name, int damage) {
        super(name, damage, SoldierType.OFFENSIVE);
    }

    @Override
    public void attack() {
        Abilities.attack(this);
    }

    @Override
    public void furyAttack() {
        Abilities.furyAttack(this);
    }

    @Override
    public void flank() {
        System.out.println(super.getName() + " is flanking");
    }
}
