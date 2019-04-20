package main.infra;

import main.model.entretien.Candidat;
import main.model.entretien.Recruteur;
import main.use_case.ConsultantRecruterService;

public class ConsultantRecruterServiceFake implements ConsultantRecruterService{


    //on cree notre liste de recruteurs
    String[][] recruteurs = {
            {"1","Michael FERY",".Net"	,"6"},
            {"2","Antoine Marchal","JAVA"	,"12"},
            {"4","Jean PAULI","C#"	,"3"}
    };


    @Override
    public Recruteur getRecruterId(int id) {
        //on recupere dans la liste les infos candidat

        for(int i=0;i<recruteurs.length;i++){
            int recruteurId = Integer.parseInt(recruteurs[i][0]);

            if(recruteurId == id){
                String name = recruteurs[i][1];
                String specialite = recruteurs[i][2];
                int anneeExperience = Integer.parseInt(recruteurs[i][3]);

                //on creer notre objet candidat et on passe en parametre les elements du candidat
                return new Recruteur(recruteurId, name, specialite, anneeExperience);
            }

        }

        //en cas d'erreur
        return new Recruteur(-1, "", "aucune", 0);
    }
}
