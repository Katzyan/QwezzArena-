package org.example;

public class Utils {


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

    public static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    }

