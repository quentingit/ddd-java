package main.use_case;

import main.model.entretien.Entretien;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class PlanifierEntretienTest {

    @Test
    public void PlanifierEntretienStatut() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        PlanifierEntretien planifierEntretien = new PlanifierEntretien(calendar,20,1,1);
        planifierEntretien.execute();

        assertEquals(planifierEntretien.getEntretien().getStatut(), Entretien.statutEnum.PLANIFIE);
    }

    ////////////////////////////
    ////////////////ATTENTION POUR CE TEST TU PEUX PAS, ON GENERE UN ID RANDOM LORS DE L ENTRETIEN
    //////////////////////////
    @Test
    public void PlanifierEntretienID() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        PlanifierEntretien planifierEntretien = new PlanifierEntretien(calendar,20,1,1);
        planifierEntretien.execute();

        System.out.println("ok-->"+planifierEntretien.getEntretien().getEntretienID().getId());
        assertEquals(planifierEntretien.getEntretien().getEntretienID().getId(), 1);
    }
}