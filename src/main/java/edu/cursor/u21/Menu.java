package edu.cursor.u21;

/**
 * Created by Саша on 19.01.2017.
 */

public class Menu{
    public void Menu() {

        System.out.println("Choose Your Political Party in Supreme Council:\n" +
                "1. Party of Regions\n" +
                "2. Party of MotherLand\n" +
                "3. Party of Radicals\n");

        int i = Utils.scanInt();

        Party parties = new Party();
        switch (i){
            case 1:
                System.out.println("Your party is Party of Regions. List of deputies:");
                parties.partyOfRegions();
                break;
            case 2:
                System.out.println("Your party is Party of MotherLand. List of deputies:");
                parties.partyOfMotherLand();
                break;
            case 3:
                System.out.println("Your party is Party of Radicals. List of deputies:");
                parties.partyOfRadicals();
                break;
        }
        System.out.println("Choose Your Deputy");

//        DeputyMethods deputyMethods = new DeputyMethods();
//        deputyMethods.giveBribe();
//        deputyMethods.checkGraftersForProsecution();
//        deputyMethods.statisticsOfBribes();
//        deputyMethods.deleteDeputy();
//        deputyMethods.voting();


    }
}
