package main.infra;

import main.model.entretien.Candidat;
import main.use_case.CandidatRepository;

public class CandidatRepositoryFake implements CandidatRepository {




     String[][] candidats = {
            {"1", "jean", "IOS", "5"},
            {"2", "marc", ".NET", "4"},
            {"7", "lucie", "Android", "6"}
             };


    @Override
    public Candidat getCandidatByID(int id) {



        for(int i=0;i<candidats.length;i++){


            int candidatId = Integer.parseInt(candidats[i][0]);

            if(candidatId == id){
                String name = candidats[i][1];
                String specialite = candidats[i][2];
                int anneeExperience = Integer.parseInt(candidats[i][3]);

                return new Candidat(candidatId, name, specialite, anneeExperience);
            }

        }

        //en cas d'erreur
        return new Candidat(-1, "", "aucune", 0);
    }


}
