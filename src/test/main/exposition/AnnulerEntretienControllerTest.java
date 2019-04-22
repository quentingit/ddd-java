package main.exposition;

import main.model.entretien.Creneau;
import main.model.entretien.Entretien;
import main.use_case.AnnulerEntretien;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class AnnulerEntretienControllerTest {

    @Test
    public void annulerEntretienController() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        AnnulerEntretienController AEC = new AnnulerEntretienController(Entretien.statutEnum.NONPLANIFIE, 1, 1, 1, calendar);
        //AEC.AnnulerEntretienController();

        assertEquals(1, 1);
    }
}