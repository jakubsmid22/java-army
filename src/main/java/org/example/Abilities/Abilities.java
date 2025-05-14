package org.example.Abilities;

import org.example.Soldier.Soldier;

public class Abilities {

    public static void attack(Soldier soldier) {
        System.out.println(soldier.getClass().getSimpleName() + " " + soldier.getName() + " deals " + soldier.getDamage() + " damage.");
    }

    public static void furyAttack(Soldier soldier) {
        System.out.println(soldier.getClass().getSimpleName() + " " + soldier.getName() + " deals " + soldier.getDamage() + " damage.");
    }

    public static void defend(Soldier soldier) {
        System.out.println(soldier.getClass().getSimpleName() + " " + soldier.getName() + " deals " + soldier.getDamage() + " damage.");
    }

    public static void fireDefend(Soldier soldier) {
        System.out.println(soldier.getClass().getSimpleName() + " " + soldier.getName() + " deals " + soldier.getDamage() + " damage.");
    }

}
