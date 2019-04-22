package main.use_case;

import main.infra.EntretienRepositoryFake;
import main.model.entretien.Entretien;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnnulerEntretienTest {

    @Test
    public void AnnulerEntretienSatut() {
        AnnulerEntretien annulerEntretien = new AnnulerEntretien(1);
        annulerEntretien.execute();

        assertEquals(annulerEntretien.getEntretien().getStatut(),Entretien.statutEnum.REFUSEE);
    }

    @Test
    public void AnnulerEntretienID() {
        AnnulerEntretien annulerEntretien = new AnnulerEntretien(1);
        annulerEntretien.execute();

       // assertEquals(1, annulerEntretien.getEntretien().getEntretienID());
    }

    @Test
    public void AnnulerEntretien() {
        AnnulerEntretien annulerEntretien = new AnnulerEntretien(1);
        annulerEntretien.execute();

        assertEquals(1,annulerEntretien.getEntretien());
    }
}