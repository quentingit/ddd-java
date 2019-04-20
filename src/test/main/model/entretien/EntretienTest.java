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
    public void planifierEntretien() {
        Entretien entretien = new Entretien();
        // création candidat et recruteur
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);
        // création date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        entretien.planifierEntretien(candidat,recruteur,calendar,20);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.PLANIFIE);
    }

    @Test
    public void annulerEntretien() {
        Entretien entretien = new Entretien();
        // création candidat et recruteur
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);
        // création date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        entretien.annulerEntretien(candidat,recruteur,calendar,20);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.REFUSEE);
    }

    @Test
    public void replanifierEntretien() {
        Entretien entretien = new Entretien();
        // création candidat et recruteur
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        entretien.replanifierEntretien(candidat);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.REPLANIFIE);
    }

    @Test
    public void confirmerEntretien() {
        Entretien entretien = new Entretien();
        // création candidat et recruteur
        Candidat candidat = new Candidat(21,"Jean Arlvin","NodeJS",3);
        Recruteur recruteur = new Recruteur(10,"Jean Michel","JAVA",10);
        // création date
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        entretien.confirmerEntretien(entretien);

        assertEquals(entretien.getStatut(),Entretien.statutEnum.CONFIRMER);
    }
}