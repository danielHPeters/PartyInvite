package ch.peters.daniel.partyinviter

import ch.peters.daniel.partyinviter.model.Invitation
import ch.peters.daniel.partyinviter.model.Person
import spock.lang.Specification

import java.time.LocalDate

/**
 * Person class test.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
class PersonTest extends Specification {
  def 'can create parties and invite people'() {
    given:
    def host = new Person('Peters', 'Daniel', LocalDate.parse('1992-12-09'))

    def jLennon = new Person('Lennon', 'John', LocalDate.parse('1940-10-09'))
    def mJordan = new Person('Jordan', 'Michael', LocalDate.parse('1963-02-17'))
    def mSchuhmacher = new Person('Schuhmacher', 'Michael', LocalDate.parse('1969-01-03'))
    def guests = Arrays.asList(jLennon, mJordan, mSchuhmacher)

    when:
    host.createParty('TBZ Party', 'TBZ student party.')
    host.parties[0].invite(guests)
    host.parties[0].invitations[1].status = Invitation.Status.ACCEPTED

    then:
    !host.parties[0].guests.isEmpty() && host.parties[0].guests[0] == mJordan
  }
}
