package main.use_case;

import main.infra.EntretienRepositoryFake;
import main.model.entretien.Entretien;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnnulerEntretienTest {

    @Test
    public void execute() {
        AnnulerEntretien annulerEntretien = new AnnulerEntretien(1);
        annulerEntretien.execute();

        assertEquals(annulerEntretien.getEntretien().getStatut(),Entretien.statutEnum.REFUSEE);
    }
}