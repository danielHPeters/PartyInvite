package com.party;

/**
 * This class defines a person
 * Created by Daniel on 15.05.2017.
 * @author Daniel Peters
 * @version 1.0
 */
public class Guest extends Person {

    /**
     * Status of person
     */
    private EnumStatus status;

    /**
     * @param lastName
     * @param firstName
     */
    public Guest(String lastName, String firstName) {
        super(lastName, firstName);
        this.status = EnumStatus.INVITED;
    }

    /**
     * Accept invitation
     */
    public void acceptInvite(){
        this.status = EnumStatus.ACCEPTED;
    }

    /**
     * Reject invitation
     */
    public void rejectInvite(){
        this.status = EnumStatus.DECLINED;
    }

    /**
     * Get status of this person
     *
     * @return status of this person
     */
    public EnumStatus getStatus() {
        return status;
    }

    /**
     * Get all details of this person as string
     *
     * @return details of this person
     */
    public String getDetails() {
        return "Person: " + this.getFirstName() + " " + this.getLastName() + ", " + "Status: " + this.getStatus().toString();
    }
}
