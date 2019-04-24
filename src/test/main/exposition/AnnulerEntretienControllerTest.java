package main.exposition;

import main.model.entretien.Entretien;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnnulerEntretienControllerTest {

    @Test
    public void annulerEntretienControllerStatus() {

        //notre objet clean crée
        AnnulerEntretienController AEC =   new AnnulerEntretienController(1);


        //verifier champs par champs de l'objet
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        assertEquals(AEC.getStatut(), Entretien.statutEnum.REFUSEE);
    }

    @Test
    public void annulerEntretienControllerDate() {

        //notre objet clean crée
        AnnulerEntretienController AEC =   new AnnulerEntretienController(1);


        //verifier champs par champs de l'objet
        Calendar calendar = new GregorianCalendar(2019,1,28,13,24);

        assertEquals(AEC.getDate().toString(),new GregorianCalendar(2019,1,28,13,24).toString());
    }


    @Test
    public void annulerEntretienControllerID() {

        //notre objet clean crée
        AnnulerEntretienController AEC =   new AnnulerEntretienController(1);


        //verifier champs par champs de l'objet
        Calendar calendar = new GregorianCalendar(2019,1,28,13,24);

        assertTrue(AEC.getEntretienID() == 1);
    }


}


