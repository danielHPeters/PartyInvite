package ch.peters.daniel.partyinviter

import spock.lang.Specification

/**
 * App class unit test.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
class AppTest extends Specification {
  def 'application has a greeting'() {
    setup:
    def app = new App()

    when:
    def result = app.greeting

    then:
    result != null
  }
}
