package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.PlanifierEntretien;

import java.util.Calendar;

class PlanifierEntretienController {



    public Object PlanifierEntretienController(Calendar Date, int duree, int IdRecruter, int IdCandidat ) {

        // on cree un nouvel objet du use case Planifier entretien
        PlanifierEntretien planifierEntretien= new PlanifierEntretien(Date, duree, IdRecruter, IdCandidat);
        // on execute le nouvel objet crée
        planifierEntretien.execute();

        //on creer un objet entretien
        //on retourne dans cet objet un objet entretien qui remonte les couches precedentes
        Entretien entretien = planifierEntretien.getEntretien();



        //CREER NOTRE OBJET


        return entretien;
    }
}