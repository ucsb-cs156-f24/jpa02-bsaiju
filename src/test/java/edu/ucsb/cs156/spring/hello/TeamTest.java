package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_for_same_object() {
        assertTrue(team.equals(team),"Equals fails on same object case");
    }

    @Test
    public void equals_for_different_class() {
        String other_team = "other-team";
        assertTrue(!team.equals(other_team), "Equals fails on instances of different classes");
    }

    @Test
    public void equals_for_name_and_members() {
        Team other_team = new Team("test-team");
        other_team.addMember("Godzilla");
        team.addMember("Godzilla");
        assertTrue(team.equals(other_team), "Equals fails on same name and same members");
    }
    @Test
    public void equals_for_name_not_members() {
        Team other_team = new Team("test-team");
        other_team.addMember("Phelps");
        assertTrue(!team.equals(other_team), "Equals fails on same name but different members");
    }

    @Test
    public void equals_for_members_not_name() {
        Team other_team = new Team("other-team");
        other_team.addMember("Dracula");
        team.addMember("Dracula");
        assertTrue(!team.equals(other_team), "Equals fails on different name but same members");
    }

    @Test
    public void hashCode_test() {
        team.setName("Jekyll");
        team.addMember("Hyde");
        Team other_team = new Team();
        other_team.setName("Jekyll");
        other_team.addMember("Hyde");
        assertEquals(team.hashCode(), other_team.hashCode());
    }


    @Test
    public void hashCode_mutation_test_bandaid() {
        int result = team.hashCode();
        int expectedResult = -1226298695;
        assertEquals(expectedResult, result);
    }
}
