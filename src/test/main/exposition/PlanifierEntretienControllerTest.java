package main.exposition;

import main.model.entretien.Creneau;
import main.model.entretien.Entretien;
import main.use_case.PlanifierEntretien;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class PlanifierEntretienControllerTest {

    @Test
    public void planifierEntretienController() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar, 0);
        PlanifierEntretienController PEC = new PlanifierEntretienController(calendar,20,1,1);

        assertEquals(PEC.getStatut(), Entretien.statutEnum.PLANIFIE);
    }

    @Test
    public void PlanifierEntretienControllerDate() {
        Calendar calendar = new GregorianCalendar(2019,1,28,13,24);

        //notre objet clean crée
        PlanifierEntretienController AEC =   new PlanifierEntretienController(calendar,20,1,1);

        assertEquals(AEC.getDate().getTimeInMillis(),new GregorianCalendar(2019,1,28,13,24).getTimeInMillis());
    }


    @Test
    public void PlanifierEntretienControllerID() {
        Calendar calendar = new GregorianCalendar(2019,1,28,13,24,56);

        //notre objet clean crée
        PlanifierEntretienController AEC =   new PlanifierEntretienController(calendar,20,1,1);
        AEC.setEntretienID(1);

        assertTrue(AEC.getEntretienID() == 1);
    }
}