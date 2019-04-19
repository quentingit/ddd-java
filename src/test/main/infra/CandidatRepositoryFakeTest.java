package main.infra;

import main.model.entretien.Candidat;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CandidatRepositoryFakeTest {

    @Test
    public void getCandidatByID() {;

        //on recherche un candidat pour l'id 1
         Candidat candidat = new CandidatRepositoryFake().getCandidatByID(1);

        //on creer un objet qui equivaut a candidat id=1
       //Candidat candidat= new Candidat(1, "jean", "IOS", 5);

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
    public void getCandidatByID2() {;

        //on recherche un candidat pour l'id 7
        Candidat candidat= new CandidatRepositoryFake().getCandidatByID(7);

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
    public void getCandidatByID3() {;

        //on recherche un candidat pour l'id 7
        Candidat candidat= new CandidatRepositoryFake().getCandidatByID(7);

        //on creer un objet qui equivaut a candidat id=1
        Candidat candidatEqual= new Candidat(7, "lucie", "Android", 6);

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
}