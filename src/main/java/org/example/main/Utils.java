package org.example.main;

import org.example.characters.MainCharacter;
import org.example.npc.NPC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);


    public static void qalogo() {
        System.out.println("   _____ ");
        System.out.println("  /     \\     __          __     _____      ______      ______ ");
        System.out.println(" /       \\    \\ \\        / /    |  ___|    |___  /     |___  / ");
        System.out.println("|         |    \\ \\  /\\  / /     | |__         / /         / / ");
        System.out.println("|   ( )   |     \\ \\/  \\/ /      |  __|        / /        / /  ");
        System.out.println(" \\       /       \\  /\\  /       | |___       / /__      / /__ ");
        System.out.println("  \\_____/         \\/  \\/        |_____|     /_____|    /_____|");
        System.out.println("      \\_\\ ");
        System.out.println("                                                          ___");
        System.out.println("               _____      _____    __   __                | |               ");
        System.out.println("     /\\       |  __ \\    |  ___|   | \\ | |       /\\       | |             ");
        System.out.println("    /  \\      | |__) |   | |__     |  \\| |      /  \\      | |       ");
        System.out.println("   / /\\ \\     |  _  /    |  __|    | . ` |     / /\\ \\     | |            ");
        System.out.println("  / ____ \\    | | \\ \\    | |___    | |\\  |    / ____ \\                            ");
        System.out.println(" /_/    \\_\\   |_|  \\_\\   |_____|   |_| \\_|   /_/    \\_\\   (_)                         ");
        System.out.println();


    }

    public static void initialMenu() {
        System.out.println("                        1. Start New Game\n");
        System.out.println("                          2. Load Save\n");
        System.out.println("                            3. Exit\n");
    }

    public static void mainMenu() {
        System.out.println("-------------------------------------------");
        System.out.println("                        1. Character info");
        System.out.println("                        2. Next fight ");
        System.out.println("                        3. Shop");
        System.out.println("                        4. Exit");
    }

    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static int getOptionOneToFour() {
        int option;
        while (true) {
            try {
                option = scannerInt.nextInt();
                if (option < 1 || option > 4) {
                    continue;
                }
                break;
            } catch (Throwable e) {
                scannerInt.next();
            }
        }
        return option;
    }

    public static int getOptionOneToThree() {
        int option;
        while (true) {
            try {
                option = scannerInt.nextInt();
                if (option < 1 || option > 3) {
                    continue;
                }
                break;
            } catch (Throwable e) {
                scannerInt.next();
            }
        }
        return option;
    }


    public static int getOptionOneToTwo() {
        int option;
        while (true) {
            try {
                option = scannerInt.nextInt();
                if (option < 1 || option > 2) {
                    continue;
                }
                break;
            } catch (Throwable e) {
                scannerInt.next();
            }
        }
        return option;
    }

    public static int getOptionOneToFive() {
        int option;
        while (true) {
            try {
                option = scannerInt.nextInt();
                if (option < 1 || option > 5) {
                    continue;
                }
                break;
            } catch (Throwable e) {
                scannerInt.next();
            }
        }
        return option;
    }


    public static void fight(MainCharacter character1, NPC npc1) {
        List<String> tracker = new ArrayList<>();
        tracker.add("Filler");
        System.out.println(npc1.getName() + " has joined the battle");
        int round = 1;
        while (true) {

            System.out.println();
            System.out.println("               Round " + round + "!");
            System.out.println("--------------------------------");
            System.out.println("         " + npc1.getName() + "     |      " + character1.getName());
            System.out.println("       " + "HP: " + npc1.getHp() + "     |     " + "HP: " + character1.getCurrentHP() + "/" + character1.getMaxHP());
            System.out.println("       " + "Damage: ??" + " |     " + "Damage: " + character1.getBaseDamage());
            System.out.println("       " + "Crit: ??" + "   |     " + "Crit: " + character1.getCrit());
            character1.showAbilities();
            while (true) {
                switch (getOptionOneToFive()) {
                    case 1:
                        character1.lightAttack(npc1);
                        tracker.add("Light");
                        break;
                    case 2:
                        if (tracker.get(round - 1).equals("Heavy")) {
                            System.out.println("Ability is on cooldown for this round. Use a different ability");
                            continue;
                        }
                        character1.heavyAttack(npc1);
                        tracker.add("Heavy");
                        break;
                    case 3:
                        if (character1.getLevel() < 2) {
                            break;
                        }
                        character1.damageOverTime(npc1);
                        tracker.add("DOT");
                        break;
                    case 4:
                        if (character1.getLevel() < 3) {
                            break;
                        }
                        character1.sustainAttack(npc1);
                        tracker.add("Sustain");
                        break;
                    case 5:
                        if (character1.getLevel() < 5) {
                            break;
                        }
                        character1.crowdControl(npc1);
                        tracker.add("CC");
                        break;
                }
                round++;
                break;
            }
            if (npc1.getHp() <= 0) {
                System.out.println("Congrats. You have won the fight");
                break;
            }
            //NPC sa te atace si el
            System.out.println(npc1.getName() + " attacks you for " + npc1.getDamage() + " damage.");
            character1.takeDamage(npc1.getDamage());
            if(character1.getCurrentHP() <= 0){
                System.out.println("You died.");
                System.out.println("Game Over");
                System.exit(0);
            }

        }

    }


}

