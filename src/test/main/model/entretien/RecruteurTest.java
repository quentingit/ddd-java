package main.model.entretien;

import org.junit.Test;

import static org.junit.Assert.*;

public class RecruteurTest {

    @Test
    public void RecruteurID() {
        Recruteur recruteur = new Recruteur(1,"Quentin BERANGER","photography",5);

        assertEquals(recruteur.getRecruterId(), 1);
    }

    @Test
    public void RecruteurAnneeExperience() {
        Recruteur recruteur = new Recruteur(1,"Quentin BERANGER","photography",5);

        assertEquals(recruteur.getAnneeExperienceEvaluation(), 5);
    }

    @Test
    public void RecruteurName() {
        Recruteur recruteur = new Recruteur(1,"Quentin BERANGER","photography",5);

        assertEquals(recruteur.getName(), "Quentin BERANGER");
    }

    @Test
    public void RecruteurSpeciality() {
        Recruteur recruteur = new Recruteur(1,"Quentin BERANGER","photography",5);

        assertEquals(recruteur.getSpecialite(), "photography");
    }

    @Test
    public void RecruteurProcess() {
        Recruteur recruteur = new Recruteur(1,"Quentin BERANGER","photography",5);
        recruteur.setProcess("1er rendez-vous");

        assertEquals(recruteur.getProcess(), "1er rendez-vous");
    }

    @Test
    public void RecruteurCommentaire() {
        Recruteur recruteur = new Recruteur(1,"Quentin BERANGER","photography",5);
        recruteur.setCommentaire("ponctuel");

        assertEquals(recruteur.getCommentaire(), "ponctuel");
    }
}