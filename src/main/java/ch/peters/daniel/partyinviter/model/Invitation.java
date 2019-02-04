package ch.peters.daniel.partyinviter.model;

import java.util.UUID;

/**
 * Invitation model class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Invitation extends Entity {
  private Party party;
  private Person person;
  private Status status;

  public enum Status {
    INVITED, ACCEPTED, DECLINED
  }

  public Invitation(UUID id, Party party, Person person, Status status) {
    super(id);
    this.party = party;
    this.person = person;
    this.status = status;
  }

  public Invitation(UUID id, Party party, Person person) {
    this(id, party, person, Status.INVITED);
  }

  public Invitation(Party party, Person person) {
    this(UUID.randomUUID(), party, person, Status.INVITED);
  }

  public Invitation(Party party, Person person, Status status) {
    this(UUID.randomUUID(), party, person, status);
  }

  public Party getParty() {
    return party;
  }

  public Person getPerson() {
    return person;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    if (status == Status.ACCEPTED) {
      party.getGuests().add(person);
    } else {
      party.getGuests().remove(person);
    }

    this.status = status;
  }
}
