package org.example.main;

import java.util.Scanner;

public class Utils {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerString = new Scanner(System.in);


    public static void qalogo(){
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

    public static void initialMenu(){
        System.out.println("                        1. Start New Game\n");
        System.out.println("                          2. Load Save\n");
        System.out.println("                            3. Exit\n");
    }

    public static void mainMenu(){
        System.out.println("-------------------------------------------");
        System.out.println("                        1. Character info");
        System.out.println("                        2. Next fight ");
        System.out.println("                        3. Shop");
        System.out.println("                        4. Exit");
    }

    public static void clearConsole(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static int getOptionOneToFour(){
        int option;
       while(true){
           try{
               option = scannerInt.nextInt();
               if(option < 1 || option > 4){
                   continue;
               }
               break;
           } catch (Throwable e){
               scannerInt.next();
           }
       }
        return option;
    }

    public static int getOptionOneToThree(){
        int option;
        while(true){
            try{
                option = scannerInt.nextInt();
                if(option < 1 || option > 3){
                    continue;
                }
                break;
            } catch (Throwable e){
                scannerInt.next();
            }
        }
        return option;
    }




    }

