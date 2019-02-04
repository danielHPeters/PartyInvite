package ch.peters.daniel.partyinviter.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Party model class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Party extends Entity {
  private String name;
  private String description;
  private Person host;
  private List<Person> guests;
  private List<Invitation> invitations;

  public Party(UUID id, String name, String description, Person host) {
    super(id);
    this.name = name;
    this.description = description;
    this.guests = new ArrayList<>();
    this.host = host;
    this.invitations = new ArrayList<>();
  }

  public Party(String name, String description, Person host) {
    this(UUID.randomUUID(), name, description, host);
  }

  public void invite(Person person) {
    invitations.add(new Invitation(this, person));
  }

  public void invite(List<Person> people) {
    people.forEach(this::invite);
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Person getHost() {
    return host;
  }

  public List<Person> getGuests() {
    return guests;
  }

  public List<Invitation> getInvitations() {
    return invitations;
  }
}
