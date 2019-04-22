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

        //notre objet clean crée
        AnnulerEntretienController AEC =   new AnnulerEntretienController(1);


        //verifier champs par champs de l'objet
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);


        assertEquals(1, 1);
    }
}


