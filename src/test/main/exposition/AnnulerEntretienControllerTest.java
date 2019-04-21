package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.AnnulerEntretien;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class AnnulerEntretienControllerTest {

    @Test
    @Ignore
    public void confirmerEntretienController() {
        Calendar calendar = new GregorianCalendar(2013,1,28,13,24,56);
        AnnulerEntretienController annulerEntretienController = new AnnulerEntretienController(Entretien.statutEnum.NONPLANIFIE,1,1,1,calendar);
        System.out.println("Annuler entretien créé");
        AnnulerEntretienController AEC = annulerEntretienController.AnnulerEntretienController(1); // <--- TOUJOURS NULL

        AnnulerEntretien AnnulerEntretien= new AnnulerEntretien(1);
        AnnulerEntretien.execute();
        Entretien entretien = AnnulerEntretien.getEntretien();
        AnnulerEntretienController objetResponse =  new AnnulerEntretienController(
                entretien.getStatut(),
                entretien.getEntretienID().getId(),
                1,
                1,
                calendar);
        assertEquals(objetResponse.hashCode(),AEC.hashCode());
    }
}