package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Bharat";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "bsaiju";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f24-03");
        team.addMember("Bharat");
        team.addMember("Priyanka");
        team.addMember("Chris C.");
        team.addMember("Eugene L.");
        team.addMember("Sameer");
        team.addMember("Chloe");
        return team;
    }
}
