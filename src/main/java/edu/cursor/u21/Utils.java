package edu.cursor.u21;

import java.util.Scanner;

/**
 * Created by uiv on 1/21/17.
 */
class Utils {
    static double scanner(){
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextDouble()){
            System.out.println("Barter is not allowed. Please, set real amount of money.");
            scanner.nextLine();
        }
        return scanner.nextDouble();
    }

    static int scanInt(){
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            System.out.println("Wrong choice, repeat:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static Scanner scan = new Scanner(System.in);
}