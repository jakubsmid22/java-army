    package org.example.Soldier;

    import org.example.Abilities.Abilities;
    import org.example.Abilities.Attacker;
    import org.example.Abilities.Defender;

    public class Swordsman extends Soldier implements Attacker, Defender {
        public Swordsman(String name, int damage) {
            super(name, damage, SoldierType.ADAPTABLE);
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
        public void defend() {
            Abilities.defend(this);
        }

        @Override
        public void fireDefend() {
            Abilities.fireDefend(this);
        }
    }
