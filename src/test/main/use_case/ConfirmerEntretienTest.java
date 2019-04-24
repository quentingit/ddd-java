package main.use_case;


import main.model.entretien.Entretien;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfirmerEntretienTest {

    @Test
    public void ConfirmerEntretienStatut() {
        ConfirmerEntretien confirmerEntretien = new ConfirmerEntretien(1);
        confirmerEntretien.execute();

        assertEquals(confirmerEntretien.getEntretien().getStatut(), Entretien.statutEnum.CONFIRMER);
    }

    @Test
    public void ConfirmerEntretienID() {
        ConfirmerEntretien confirmerEntretien = new ConfirmerEntretien(1);
        confirmerEntretien.execute();

        assertEquals(confirmerEntretien.getEntretien().getEntretienID().getId(),1);
    }
}