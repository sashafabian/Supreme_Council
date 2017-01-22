package edu.cursor.u21;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by O.Kociuta on 20.01.2017.
 */
public class DeputyMethods implements DeputyInterface {

    @Override
    public void giveBribe(Deputy deputy) {
        if (deputy.isGrafter()) {
            deputy.setBribe(Utils.scanner());
        } else {
            throw new IllegalStateException("This deputy is not a bribetaker!");
        }
    }

    void checkGraftersForProsecution(Deputy deputy) {
        double bribe = deputy.getBribe();
        String name = deputy.getName();
        String currentDeputyPartyName = deputy.getParty();
        double partyHeadsPercent = 0.3;

        if (bribe <= 0) {
            System.out.println("Don't shame your shoes! That's not a bribe!");
        } else if (bribe > 0 && bribe <= 5_000) {
            System.out.println("Deputy " + name + " is the honest person in the world!");
        } else if (bribe > 5_000 && bribe <= 50_000) {
            deputy.setUnderNABU(true);
            deputy.setUnderProsecutor(false);
            System.out.println("Deputy " + name + "is prosecuted under Bribery Act by NABU");
        } else if (bribe >= 50_000 && bribe <= 100_000) {
            deputy.setUnderNABU(false);
            deputy.setUnderProsecutor(true);
            System.out.println("Deputy " + name + "is prosecuted under Bribery Act by GPU");
        } else {
            for (Deputy dep : SupremeCouncil.listOfDeputies) {
                if (dep.getParty() == currentDeputyPartyName) {
                    dep.setBribe(bribe * partyHeadsPercent);
                    System.out.println("Head of party got bribe. ");
                } else throw new IllegalStateException("There is no head of Party. P.S. you go to jail)) ");
            }
        }
    }

    public void statisticsOfBribes(HashSet<Deputy> regions, HashSet<Deputy> motherland, HashSet<Deputy> radicals) {
        Set<Deputy> stat;
        boolean a = true;
        int key;
        while (a) {
            System.out.println("Enter number of party to print statistics:\n1-partyOfRegions\2-partyOfMotherLand\n3-partyOfRadicals");
            key = Utils.scanInt();
            switch (key) {
                case 1:
                    stat = regions;
                    a = false;
                    break;
                case 2:
                    stat = motherland;
                    a = false;
                    break;
                case 3:
                    stat = radicals;
                    a = false;
                    break;
                default:
                    System.out.println("Wrong choice, repeat:");
                    break;
            }
        }
        for (Deputy deputat : stat) {
            System.out.println("Deputy " + deputat.getName() + " - " + deputat.getBribe() + " dollars");
        }
    }

    public HashSet<Deputy> deleteDeputy(HashSet<Deputy> deputy) {
        System.out.println("List of deputy to delete, enter surname from this list:");
        for (Deputy dep : deputy) {
            if (dep.isUnderNABU() || dep.isUnderProsecutor())
                System.out.println(dep.getName());
        }
        String surname = Utils.scan.next();
        int i = 0;
        for (Deputy dep : deputy) {
            if (surname == dep.getName()) {
                deputy = voting(dep, deputy);
                i = 1;
                break;
            }
        }
        if (i == 0) System.out.println("No matches, this time they were lucky");
        return deputy;
    }

    public HashSet<Deputy> voting(Deputy dep, HashSet<Deputy> deputy) {
        double percentageOftruthfulness = 0.3;
        double twoThirds = 0.66;
        double half = 0.5;
        int golosuvanya = 0;
        int amountDeputy;

        if (dep.isUnderNABU()) {
            golosuvanya = (int) (Math.random() * amountDeputy * percentageOftruthfulness);
            System.out.println("Deputy" + dep.getName() + "against him violates case NABU");
            System.out.println("Voting =" + golosuvanya);
            if (golosuvanya > twoThirds * amountDeputy) {
                deputy.remove(dep);
                System.out.println("Deputy delete from the party");
            } else {
                System.out.println("It was not typed required amout of votes");
            }
        }
        if (dep.isUnderProsecutor()) {
            golosuvanya = (int) (Math.random() * amountDeputy * percentageOftruthfulness);
            System.out.println("Deputy" + dep.getName() + "against him violates case GPU");
            System.out.println("Voting =" + golosuvanya);
            if (golosuvanya > half * amountDeputy) {
                deputy.remove(dep);
                System.out.println("Deputy delete from the party!");
            } else {
                System.out.println("It was not typed required amout of votes");
            }
        }
        return deputy;
    }
}
