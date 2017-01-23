package edu.cursor.u21;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by O.Kociuta on 20.01.2017.
 */
@Getter
public class SupremeCouncil {
    public Set<Deputy> partyOfRegions = new HashSet<Deputy>();
    public Set<Deputy> partyOfMotherLand = new HashSet<Deputy>();
    public Set<Deputy> partyOfRadicals = new HashSet<Deputy>();
    public static List<Deputy> listOfDeputies = new ArrayList<Deputy>();
    }