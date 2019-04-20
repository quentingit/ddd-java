package main.model.entretien;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class CreneauTest {

    @Test
    public void getHeureFinSansDuree() {
        // création de la date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar, 0);

        assertEquals(creneau.getHeureDebut(),creneau.getHeureFin());
    }

    @Test
    public void getHeureFinSansDuree2() {
        // création de la date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar, 0);
        int heureDebut =  calendar.get(Calendar.MINUTE)*60 + calendar.get(Calendar.MINUTE);

        assertEquals(heureDebut,creneau.getHeureFin());
    }

    @Test
    public void getHeureFinAvecDuree() {
        // création de la date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar, 30);
        int heureDebut =  calendar.get(Calendar.MINUTE)*60 + calendar.get(Calendar.MINUTE);

        assertEquals(heureDebut+30,creneau.getHeureFin());
    }

    @Test
    public void getHeureFinAvecDureeDeuxCreneaux() {
        // création de la date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar, 30);
        Creneau creneau2 = new Creneau(calendar, 30);

        assertEquals(creneau2.getHeureFin(),creneau.getHeureFin());
    }

    @Test
    public void getHeuredebutIdentique() {
        // création de la date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar, 0);
        int heureDebut =  calendar.get(Calendar.MINUTE)*60 + calendar.get(Calendar.MINUTE);


        assertEquals(heureDebut,creneau.getHeureDebut());
    }

    @Test
    public void getHeureDebutDureeDifferentes() {
        // création de la date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar, 0);
        Creneau creneau2 = new Creneau(calendar, 30);


        assertEquals(creneau2.getHeureDebut(),creneau.getHeureDebut());
    }

    @Test
    public void getHeureDebutDifferentes() {
        // création de la date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        Calendar calendar2 = new GregorianCalendar(2012,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar, 0);
        Creneau creneau2 = new Creneau(calendar2, 0);

        assertNotSame(creneau2.getHeureDebut(),creneau.getHeureDebut());
    }

    @Test
    public void getDate() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        Creneau creneau = new Creneau(calendar, 0);

        assertEquals(calendar, creneau.getDate());
    }

    @Test
    public void getDateDifferentes() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        Calendar calendar2 = new GregorianCalendar(2011,1,28,13,24,56);
        Creneau creneau = new Creneau(calendar, 0);

        assertNotSame(calendar2, creneau.getDate());
    }
}