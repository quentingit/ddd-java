package main.use_case;

import main.model.entretien.Entretien;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class PlanifierEntretienTest {

    @Test
    public void PlanifierEntretienStatut() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        PlanifierEntretien planifierEntretien = new PlanifierEntretien(calendar,20,1,1);
        planifierEntretien.execute();

        assertEquals(planifierEntretien.getEntretien().getStatut(), Entretien.statutEnum.PLANIFIE);
    }

    @Test
    public void PlanifierEntretienID() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        PlanifierEntretien planifierEntretien = new PlanifierEntretien(calendar,20,1,1);
        planifierEntretien.execute();

        assertEquals(planifierEntretien.getEntretien().getEntretienID(), 1);
    }
}