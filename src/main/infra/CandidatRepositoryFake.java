package main.infra;

import main.model.entretien.Candidat;
import main.use_case.CandidatRepository;

public class CandidatRepositoryFake implements CandidatRepository {




    //on cree notre liste de candidats
     String[][] candidats = {
            {"1", "jean", "IOS", "5"},
            {"2", "marc", ".NET", "4"},
            {"7", "lucie", "Android", "6"}
             };


    @Override
    public Candidat getCandidatByID(int id) {

        //on recupere dans la liste les infos candidat

        for(int i=0;i<candidats.length;i++){


            int candidatId = Integer.parseInt(candidats[i][0]);

            if(candidatId == id){
                String name = candidats[i][1];
                String specialite = candidats[i][2];
                int anneeExperience = Integer.parseInt(candidats[i][3]);

                //on creer notre objet candidat et on passe en parametre les elements du candidat
                return new Candidat(candidatId, name, specialite, anneeExperience);
            }

        }

        //en cas d'erreur
        return new Candidat(-1, "", "aucune", 0);
    }


}
