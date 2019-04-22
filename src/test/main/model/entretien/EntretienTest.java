package main.model.entretien;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class EntretienTest {

    @Test
    public void getStatutParDefaut() {
        Entretien entretien = new Entretien();
        assertEquals(entretien.getStatut(), Entretien.statutEnum.NONPLANIFIE);
    }

    @Test
    public void planifierEntretienStatut() {
        Entretien entretien = new Entretien();

        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);

        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        entretien.planifierEntretien(candidat,recruteur,calendar,20);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.PLANIFIE);
    }

    @Test
    public void annulerEntretien() {
        Entretien entretien = new Entretien();

        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);

        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        entretien.annulerEntretien(entretien);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.REFUSEE);
    }

    @Test
    public void replanifierEntretienStatut() {
        Entretien entretien = new Entretien();

        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        Recruteur recruteur = new Recruteur(1,"Pierre-Henri","presentation",1);
        entretien.replanifierEntretien(entretien,candidat,recruteur,calendar,20);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.REPLANIFIE);
    }

    @Test
    public void confirmerEntretienStatut() {
        Entretien entretien = new Entretien();

        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);

        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        entretien.confirmerEntretien(entretien);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.CONFIRMER);
    }
}