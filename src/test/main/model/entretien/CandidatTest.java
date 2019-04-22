package main.model.entretien;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandidatTest {
    @Test
    public void getCandidatByID() {;
        Candidat candidat = new Candidat(1, "jean", "IOS", 5);
        Candidat candidatEqual= new Candidat(1, "jean", "IOS", 5);

        assertEquals(candidatEqual.hashCode(), candidat.hashCode());
    }

    @Test
    public void getCandidatByIDDifferents() {;
        Candidat candidat= new Candidat(2, "henri", "JAVA", 2);
        Candidat candidatEqual= new Candidat(1, "jean", "IOS", 5);

        assertNotSame(candidat.hashCode(), candidatEqual.hashCode());
    }

    @Test
    public void getCandidatByID7Equivalents() {;
        Candidat candidat= new Candidat(7, "lucie", "Android", 6);
        Candidat candidatEqual= new Candidat(7, "lucie", "Android", 6);

        assertEquals(candidatEqual.hashCode(), candidat.hashCode());
    }
}