package main.infra;

import main.model.entretien.Candidat;
import main.model.entretien.Recruteur;
import main.use_case.ConsultantRecruterService;

public class ConsultantRecruterServiceFake implements ConsultantRecruterService{


    //on cree notre liste de recruteurs
    String[][] recruteurs = {
            {"1","Michael FERY","process", ".Net"	,"6", ""},
            {"2","Michael FERY","", ".Net"	,"6", ""},
            {"3","Michael FERY","", ".Net"	,"6", ""}
    };


    @Override
    public Recruteur getRecruterId(int id) {
        return null;
    }
}
