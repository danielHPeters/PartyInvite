package com.party;

/**
 * This class defines a person.
 * Created by Daniel on 15.05.2017.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Person {

    /**
     * Last name of person
     */
    private String lastName;

    /**
     * First name of person
     */
    private String firstName;



    /**
     * Default constructor. Sets last name and first name of person. Also sets the status to UNKNOWN.
     *
     * @param lastName
     * @param firstName
     */
    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    /**
     * Get last name of this person
     *
     * @return last name of this person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get first name of this person
     *
     * @return first name of this person
     */
    public String getFirstName() {
        return firstName;
    }

}
