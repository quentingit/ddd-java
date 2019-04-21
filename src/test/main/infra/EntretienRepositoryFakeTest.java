package main.infra;

import main.model.entretien.Entretien;
import main.use_case.EntretienRepository;
import org.junit.Test;

import static org.junit.Assert.*;

public class EntretienRepositoryFakeTest {

    @Test
    public void getEntretienId() {

        EntretienRepository entretienRepository = new EntretienRepositoryFake();
        Entretien entretien = entretienRepository.getEntretienId(1);
    }

    @Test
    public void setEntretien() {
    }
}