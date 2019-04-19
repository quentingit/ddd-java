package main.infra;

import main.model.entretien.Recruteur;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsultantRecruterServiceFakeTest {

    @Test
    public void getRecruterIdDifferents() {

        //on recherche un recruter pour l'id 1
        Recruteur recruteur = new ConsultantRecruterServiceFake().getRecruterId(1);

        Recruteur recruteurEqual= new Recruteur(1, "jean", "IOS", 5);

        int assertEquals=0;

        // comparing above created Objects.
        if(recruteurEqual.hashCode() == recruteur.hashCode())
        {
            if(recruteurEqual.equals(recruteur)) {
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
    public void getRecruterIdIdentiques() {

        //on recherche un recruter pour l'id 1
        Recruteur recruteur = new ConsultantRecruterServiceFake().getRecruterId(1);

        Recruteur recruteurEqual= new Recruteur(1, "Michael FERY",".Net", 6);

        int assertEquals=0;

        // comparing above created Objects.
        if(recruteurEqual.hashCode() == recruteur.hashCode())
        {
            if(recruteurEqual.equals(recruteur)) {
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