package edu.cursor.u21;

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
}
