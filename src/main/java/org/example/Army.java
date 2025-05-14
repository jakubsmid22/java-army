    package org.example;

    import org.example.Abilities.Attacker;
    import org.example.Abilities.Defender;
    import org.example.Abilities.Flanker;
    import org.example.Soldier.Soldier;

    import java.util.ArrayList;

    public class Army {

        ArrayList<Soldier> soldiers = new ArrayList<>();

        public void addSoldier(Soldier soldier) {
            soldiers.add(soldier);
        }

        public void report() {
            System.out.println("-------REPORT--------");
            for (Soldier soldier : soldiers) {
                soldier.report();
            }

            System.out.println();
            System.out.println();
        }

        public void attack() {
            System.out.println("-------ATTACK--------");
            for(Soldier soldier : soldiers) {
                if (soldier instanceof Attacker) {
                    ((Attacker) soldier).attack();
                }
            }
            System.out.println();
            System.out.println();
        }

        public void defend() {
            System.out.println("-------DEFEND--------");
            for(Soldier soldier : soldiers) {
                if (soldier instanceof Defender) {
                    ((Defender) soldier).defend();
                }
            }
            System.out.println();
            System.out.println();
        }

        public void furyAttack() {
            System.out.println("-------FURY ATTACK--------");
            for(Soldier soldier : soldiers) {
                if (soldier instanceof Attacker) {
                    ((Attacker) soldier).furyAttack();
                }
            }
            System.out.println();
            System.out.println();
        }

        public void fireDefend() {
            System.out.println("-------FIRE DEFEND--------");
            for(Soldier soldier : soldiers) {
                if (soldier instanceof Defender) {
                    ((Defender) soldier).fireDefend();
                }
            }
            System.out.println();
            System.out.println();
        }

        public void flank() {
            System.out.println("-------FLANK--------");
            for (Soldier soldier : soldiers) {
               if (soldier instanceof Flanker) {
                   ((Flanker) soldier).flank();
               }
            }
        }

    }
