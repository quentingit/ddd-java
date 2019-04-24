package main.use_case;

import main.infra.EntretienRepositoryFake;
import main.model.entretien.Entretien;

public class ConfirmerEntretien {


    private int IdEntretien;

    private Entretien entretien;

    public ConfirmerEntretien(int IdEntretien) {
            this.IdEntretien=IdEntretien;

    }
    public void execute() {

        EntretienRepositoryFake entretienRepositoryFake = new EntretienRepositoryFake();
        this.entretien = entretienRepositoryFake.getEntretienId(this.IdEntretien);
        this.entretien.confirmerEntretien(entretien);
        entretienRepositoryFake.setEntretien(entretien);
        
    }

    public Entretien getEntretien() {
        return entretien;
    }

}
