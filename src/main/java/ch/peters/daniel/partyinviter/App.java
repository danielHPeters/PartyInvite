package ch.peters.daniel.partyinviter;

/**
 * Main application class.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class App {
  public String getGreeting() {
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
