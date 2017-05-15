package com.party;

import java.util.ArrayList;
import java.util.List;

/**
 * This class defines a party.
 * Created by Daniel on 15.05.2017.
 * @author Daniel Peters
 * @version 1.0
 */
public class Party {

    /**
     * Name of Party
     */
    private String name;

    /**
     * Descruiption of party
     */
    private String description;

    /**
     * List of invited people
     */
    private List<Guest> invitedPeople;

    /**
     *
     * @param name
     * @param description
     */
    public Party(String name, String description){
        this.name = name;
        this.description = description;
        this.invitedPeople = new ArrayList<>();
    }

    /**
     * Get name of party
     * @return name of party
     */
    public String getName() {
        return name;
    }

    /**
     * Get description of party
     * @return description of party
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get list of invited people
     * @return list of invited people
     */
    public List<Guest> getInvitedPeople() {
        return invitedPeople;
    }
}
