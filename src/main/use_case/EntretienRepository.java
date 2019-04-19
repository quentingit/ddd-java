package main.use_case;

import main.model.entretien.Entretien;
import main.model.entretien.Recruteur;

public interface EntretienRepository {



    public Entretien getEntretienId(int id);
    public Entretien setEntretien(Entretien entretien);

}
