package ch.peters.daniel.partyinviter.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Person model class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Person extends Entity {
  private List<Party> parties;
  private String lastName;
  private String firstName;
  private LocalDate birthday;

  public Person(UUID id, String lastName, String firstName, LocalDate birthday) {
    super(id);
    this.parties = new ArrayList<>();
    this.lastName = lastName;
    this.firstName = firstName;
    this.birthday = birthday;
  }

  public Person(String lastName, String firstName, LocalDate birthday) {
    this(UUID.randomUUID(), lastName, firstName, birthday);
  }

  public void createParty(String name, String description) {
    parties.add(new Party(name, description, this));
  }

  public List<Party> getParties() {
    return parties;
  }

  public String getLastName() {
    return lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  /**
   * Get the age of this person by subtracting the birth year of this person from the current year.
   *
   * @return Age of this person
   */
  public int getAge() {
    return LocalDate.now().getYear() - birthday.getYear();
  }
}
