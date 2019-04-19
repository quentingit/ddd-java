package main.infra;

import main.model.entretien.Candidat;
import main.model.entretien.Recruteur;
import main.use_case.ConsultantRecruterService;

public class ConsultantRecruterServiceFake implements ConsultantRecruterService{

    @Override
    public Recruteur getRecruterId(int id) {
        return null;
    }
}
