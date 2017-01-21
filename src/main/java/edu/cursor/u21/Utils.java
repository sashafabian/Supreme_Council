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
}