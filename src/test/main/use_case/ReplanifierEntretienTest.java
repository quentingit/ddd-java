package main.use_case;

import main.model.entretien.Entretien;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class ReplanifierEntretienTest {

    @Test
    public void ReplanifierEntretienStatut() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        ReplanifierEntretien replanifierEntretien = new ReplanifierEntretien(1,calendar,20,1,1);
        replanifierEntretien.execute();

        assertEquals(replanifierEntretien.getEntretien().getStatut(), Entretien.statutEnum.REPLANIFIE);
    }

    @Test
    public void ReplanifierEntretienID() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        ReplanifierEntretien replanifierEntretien = new ReplanifierEntretien(1,calendar,20,1,1);
        replanifierEntretien.execute();

        assertEquals(replanifierEntretien.getEntretien().getEntretienID(), 1);
    }
}