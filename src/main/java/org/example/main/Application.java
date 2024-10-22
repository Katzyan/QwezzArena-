package org.example.main;
import org.example.characters.*;
import org.example.npc.NPC;

import java.util.Scanner;

import static org.example.main.Utils.*;

public class Application {
    Scanner scannerInt = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

    public void start(){
        MainCharacter character1 = null;
        qalogo();


        while(true){
            initialMenu();
            //Choose name and class
            switch (getOptionOneToThree()) {
                case 1: {
                    //Start game

                    System.out.println("New game started. Creating new character.\n------------------------------------------------------------");
                    System.out.println("                        Please enter your character`s name");
                    String charName = scannerInt.nextLine();
                    while(charName.isEmpty()){
                        System.out.println("                        Please enter your character`s name");
                        charName = scannerInt.nextLine();
                    }
                    System.out.println("                        Please choose " + charName + "`s class");
                    System.out.println("                        1. Warrior");
                    System.out.println("                        2. Rogue");
                    System.out.println("                        3. Mage");
                    System.out.println("                        4. Worlock");

                    switch (getOptionOneToFour()){
                        case 1:
                             character1 = new Warrior(charName,"Warrior", 50, 10,5, 0, "Plate", 50);
                            System.out.println("New Warrior created successfully\n-------------------------------------------");
                            break;

                        case 2:
                            character1 = new Rogue(charName,"Rogue", 30, 15, 35, 0, "Leather", 50);
                            System.out.println("New Rogue created successfully\n-------------------------------------------");
                            break;

                        case 3:
                            character1 = new Mage(charName,"Mage", 20, 18, 35, 0, "Cloth", 50);
                            System.out.println("New Mage created successfully\n-------------------------------------------");
                            break;
                        case 4:
                            character1 = new Worlock(charName,"Worlock", 35, 12, 10, 0, "Cloth", 50);
                            System.out.println("New Worlock created successfully\n-------------------------------------------");
                            break;
                        default:
                    }
                    //leaving the first switch (from the logo menu)
                    break;
                }
                case 2: {

                    System.out.println("Lol. i haven`t implement this yet");
                    continue;
                }
                case 3: {
                    System.out.println("Exiting game");
                    System.exit(0);
                }

            }

            //Main Menu
            while(true){
                mainMenu();
                switch (getOptionOneToFour()){
                    case 1:
                        character1.charInfo();
                        continue;
                    case 2:
                        System.out.println("Starting fight");
                        System.out.println("Generating enemy");
                        switch (character1.getLevel()){
                            case 1:
                                NPC npc1 = new NPC("NPC1", 30, 30, 0);
                                fight(character1, npc1);
                                break;
                            case 2:
                                NPC npc2 = new NPC("NPC2", 50, 2, 0);
                                fight(character1, npc2);
                                break;
                            case 3:
                                NPC npc3 = new NPC("NPC3", 70, 2, 0);
                                fight(character1, npc3);
                                break;
                        }
                        System.out.println("Congrats on winning the battle");
                        character1.levelUp(1);
                        continue;
                    case 3:
                        System.out.println("Shop not implemented yet");
                        continue;
                    case 4:
                        break;

                }
                break;

            }



        }



    }



}
