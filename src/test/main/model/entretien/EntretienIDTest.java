package main.model.entretien;

import org.junit.Test;

import static org.junit.Assert.*;

public class EntretienIDTest {

    @Test
    public void IDGeneratedLessThan() {
        EntretienID ID = new EntretienID();
        assertTrue(ID.getId() < 9000000 );
    }

    @Test
    public void IDGeneratedGreaterThan() {
        EntretienID ID = new EntretienID();
        assertTrue(ID.getId() > 1000000 );
    }
}