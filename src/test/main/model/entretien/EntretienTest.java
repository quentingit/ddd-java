package main.model.entretien;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class EntretienTest {

    @Test
    public void planifierEntretienStatut() {
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);

        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        Creneau creneau = new Creneau(calendar,0,12);
        EntretienID ID = new EntretienID();

        Entretien entretien = new Entretien(Entretien.statutEnum.NONPLANIFIE,creneau,recruteur,candidat,ID);
        entretien.planifierEntretien(entretien, candidat,recruteur,calendar,20);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.PLANIFIE);
    }

    @Test
    public void annulerEntretienStatut() {
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);

        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        Creneau creneau = new Creneau(calendar,0,12);
        EntretienID ID = new EntretienID();

        Entretien entretien = new Entretien(Entretien.statutEnum.NONPLANIFIE,creneau,recruteur,candidat,ID);
        entretien.annulerEntretien(entretien);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.REFUSEE);
    }

    @Test
    public void replanifierEntretienStatut() {
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        Recruteur recruteur = new Recruteur(1,"Pierre-Henri","presentation",1);

        Creneau creneau = new Creneau(calendar,0,12);
        EntretienID ID = new EntretienID();

        Entretien entretien = new Entretien(Entretien.statutEnum.NONPLANIFIE,creneau,recruteur,candidat,ID);
        entretien.replanifierEntretien(entretien,candidat,recruteur,calendar,20);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.REPLANIFIE);
    }

    @Test
    public void confirmerEntretienStatut() {
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);

        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);

        Creneau creneau = new Creneau(calendar,0,12);
        EntretienID ID = new EntretienID();

        Entretien entretien = new Entretien(Entretien.statutEnum.NONPLANIFIE,creneau,recruteur,candidat,ID);
        entretien.confirmerEntretien(entretien);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.CONFIRMER);
    }

    @Test
    public void entretienID() {
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);

        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        Creneau creneau = new Creneau(calendar,0,12);
        EntretienID ID = new EntretienID();

        Entretien entretien = new Entretien(Entretien.statutEnum.NONPLANIFIE,creneau,recruteur,candidat,ID);

        assertTrue(entretien.getEntretienID().getId() > 0);
    }
}