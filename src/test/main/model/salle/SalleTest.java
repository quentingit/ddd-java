package main.model.salle;

import org.junit.Test;

import static org.junit.Assert.*;

public class SalleTest {

    @Test
    public void getNumeroDeSalle() {
        Salle salle = new Salle();
        salle.setNumeroDeSalle(122);

        assertEquals(122,salle.getNumeroDeSalle());
    }
}