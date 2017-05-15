package com.party;

import java.util.HashMap;
import java.util.Map;

/**
 * This class defines a party host.
 * Created by Daniel on 15.05.2017.
 * @author Daniel Peters
 * @version 1.0
 */
public class Host extends Person {


    /**
     * A host can create multiple parties
     */
    private Map<String, Party> parties;

    /**
     * Default constructor. Sets name and status of the host.
     * @param lastName Last name of the host
     * @param firstName First name of the host
     */
    public Host(String lastName, String firstName) {
        super(lastName, firstName);
        this.parties = new HashMap<>();
    }

    /**
     * Create a new Party.
     * @param partyName the name of the party
     * @param partyDescription the description of the party
     */
    public void createNewParty(String partyIdentification, String partyName, String partyDescription){
        this.parties.put(partyIdentification, new Party(partyName, partyDescription));
    }

    /**
     * Get all parties created by this host
     * @return hashmap containing already created parties
     */
    public Map<String, Party> getParties() {
        return parties;
    }
}
