package main.infra;

import main.model.entretien.Candidat;
import main.model.entretien.Recruteur;
import main.use_case.ConsultantRecruterService;

public class ConsultantRecruterServiceFake implements ConsultantRecruterService{



    String[][] recruteurs = {
            {"1","Michael FERY",".Net"	,"6"},
            {"2","Antoine Marchal","JAVA"	,"12"},
            {"4","Jean PAULI","C#"	,"3"}
    };


    @Override
    public Recruteur getRecruterId(int id) {


        for(int i=0;i<recruteurs.length;i++){
            int recruteurId = Integer.parseInt(recruteurs[i][0]);

            if(recruteurId == id){
                String name = recruteurs[i][1];
                String specialite = recruteurs[i][2];
                int anneeExperience = Integer.parseInt(recruteurs[i][3]);

                return new Recruteur(recruteurId, name, specialite, anneeExperience);
            }

        }


        return new Recruteur(-1, "", "aucune", 0);
    }
}
