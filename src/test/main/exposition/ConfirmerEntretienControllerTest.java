package main.exposition;

import main.model.entretien.Entretien;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class ConfirmerEntretienControllerTest {

    @Test
    public void confirmerEntretienControllerStatus() {


        //notre objet clean crée
        ConfirmerEntretienController CEC =   new ConfirmerEntretienController(1);

        assertEquals(CEC.getStatut(), Entretien.statutEnum.CONFIRMER);
    }

    @Test
    public void ConfirmerEntretienControllerDate() {

        //notre objet clean crée
        ConfirmerEntretienController AEC =   new ConfirmerEntretienController(1);


        //verifier champs par champs de l'objet
        Calendar calendar = new GregorianCalendar(2019,1,28,13,24);
        AEC.setDate(calendar);

        assertEquals(AEC.getDate().getTimeInMillis(),new GregorianCalendar(2019,1,28,13,24).getTimeInMillis());
    }


    @Test
    public void ConfirmerEntretienControllerID() {

        //notre objet clean crée
        ConfirmerEntretienController AEC =   new ConfirmerEntretienController(1);


        //verifier champs par champs de l'objet
        Calendar calendar = new GregorianCalendar(2019,1,28,13,24);

        assertTrue(AEC.getEntretienID() == 1);
    }
}