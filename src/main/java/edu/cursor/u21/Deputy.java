package edu.cursor.u21;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by O.Kociuta on 20.01.2017.
 */
@Setter
@Getter
@EqualsAndHashCode(exclude = {"bribe", "isGrafter", "isUnderNABU", "isUnderProsecutor"})
public class Deputy {
    private String name;
    private String party;
    private double bribe;
    private boolean isGrafter;
    private boolean isUnderNABU;
    private boolean isUnderProsecutor;
    private boolean isHeadOfParty = false;

    public Deputy() {
    }

    public Deputy(String name, String party, boolean isGrafter) {
        this.name = name;
        this.party = party;
        this.isGrafter = isGrafter;
    }
}
