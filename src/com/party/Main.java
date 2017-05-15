package com.party;

/**
 * Main class containing test.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Main {

    /**
     * Testing all classes
     */
    public static void testParty() {
        String partyId = "PAID001";
        Host host = new Host("Peters", "Daniel");
        host.createNewParty(partyId, "TBZ Party", "Schülerparty der TBZ.");
        host.getParties().get(partyId).getInvitedPeople().add(new Guest("Lennon", "John"));
        host.getParties().get(partyId).getInvitedPeople().add(new Guest("Jordan", "Michael"));
        host.getParties().get(partyId).getInvitedPeople().add(new Guest("Schuhmacher", "Michael"));
        host.getParties().get(partyId).getInvitedPeople().get(0).acceptInvite();
        host.getParties().get(partyId).getInvitedPeople().get(1).rejectInvite();

        host.getParties().get(partyId).getInvitedPeople().forEach(guest -> System.out.println(guest.getDetails()));
    }

    /**
     * Main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testParty();
    }
}
