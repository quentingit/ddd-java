package main.model.entretien;

import org.junit.Test;

import static org.junit.Assert.*;

public class CandidatTest {
    @Test
    public void getCandidatByID() {;

        //on recherche un candidat pour l'id 1
        Candidat candidat = new Candidat(1, "jean", "IOS", 5);

        Candidat candidatEqual= new Candidat(1, "jean", "IOS", 5);

        int assertEquals=0;

        // comparing above created Objects.
        if(candidatEqual.hashCode() == candidat.hashCode())
        {

            if(candidatEqual.equals(candidat)) {
                System.out.println("Both Objects are equal. ");
                assertEquals = 1;
            }
            else
                System.out.println("Both Objects are not equal. ");

        }
        else
            System.out.println("Both Objects are not equal. ");



        assertEquals(1, assertEquals );
    }

    @Test
    public void getCandidatByIDDifferents() {;

        //on recherche un candidat pour l'id 7
        Candidat candidat= new Candidat(2, "henri", "JAVA", 2);

        //on creer un objet qui equivaut a candidat id=1
        Candidat candidatEqual= new Candidat(1, "jean", "IOS", 5);

        int assertEquals=0;

        // comparing above created Objects.
        if(candidatEqual.hashCode() == candidat.hashCode())
        {
            if(candidatEqual.equals(candidat)) {
                System.out.println("Both Objects are equal. ");
                assertEquals = 1;
            }
            else
                System.out.println("Both Objects are not equal. ");

        }
        else
            System.out.println("Both Objects are not equal. ");

        assertEquals(0, assertEquals );
    }

    @Test
    public void getCandidatByID7Equivalents() {;
        Candidat candidat= new Candidat(7, "lucie", "Android", 6);

        Candidat candidatEqual= new Candidat(7, "lucie", "Android", 6);

        int assertEquals=0;

        if(candidatEqual.hashCode() == candidat.hashCode())
        {
            if(candidatEqual.equals(candidat)) {
                System.out.println("Both Objects are equal. ");
                assertEquals = 1;
            }
            else
                System.out.println("Both Objects are not equal. ");

        }
        else
            System.out.println("Both Objects are not equal. ");

        assertEquals(1, assertEquals );
    }
}