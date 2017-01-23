package edu.cursor.u21;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

/**
 * Created by O.Kociuta on 20.01.2017.
 */
@Setter
@Getter
@ToString(exclude = {"party", "bribe", "isGrafter", "isUnderNABU", "isUnderProsecutor", "isHeadOfParty"})
@EqualsAndHashCode(exclude = {"party", "bribe", "isGrafter", "isUnderNABU", "isUnderProsecutor", "isHeadOfParty"})
public class Deputy extends Party {
    private String name;
    private String party;
    private double bribe;
    private boolean isGrafter;
    private boolean isUnderNABU;
    private boolean isUnderProsecutor;
    private boolean isHeadOfParty = false;

    public Deputy() {
    }

    public Deputy(String name, String party) {
        this.name = name;
        this.party = party;
        this.isGrafter = new Random().nextBoolean();
    }
}
