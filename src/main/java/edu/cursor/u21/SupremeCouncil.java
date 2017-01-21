package edu.cursor.u21;

import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by O.Kociuta on 20.01.2017.
 */
@Getter
public class SupremeCouncil {
    private Set<Deputy> partyOfRegions = new HashSet<Deputy>();
    private Set<Deputy> partyOfMotherLand = new HashSet<Deputy>();
    private Set<Deputy> partyOfRadicals = new HashSet<Deputy>();
}
