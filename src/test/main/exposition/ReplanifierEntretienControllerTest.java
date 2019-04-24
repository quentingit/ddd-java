package main.exposition;

import main.model.entretien.Entretien;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class ReplanifierEntretienControllerTest {

    @Test
    public void replanifierEntretienController() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        ReplanifierEntretienController REC = new ReplanifierEntretienController(1,calendar,15,1,1);

        assertEquals(REC.getStatut(), Entretien.statutEnum.REPLANIFIE);
    }

    @Test
    public void replanifierEntretienControllerDate() {
        Calendar calendar = new GregorianCalendar(2019,1,28,13,24);

        //notre objet clean crée
        ReplanifierEntretienController AEC =   new ReplanifierEntretienController(1,calendar,15,1,1);

        assertEquals(AEC.getDate().getTimeInMillis(),new GregorianCalendar(2019,1,28,13,24).getTimeInMillis());
    }


    @Test
    public void replanifierEntretienControllerID() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        //notre objet clean crée
        ReplanifierEntretienController AEC =   new ReplanifierEntretienController(1,calendar,15,1,1);

        assertTrue(AEC.getEntretienID() == 1);
    }
}