package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.PlanifierEntretien;

import java.util.Calendar;

class PlanifierEntretienController {
    private Enum statut;
    private int IdRecruter;
    private int IdCandidat;
    private Calendar Date;
    private int IdEntretien;


    public PlanifierEntretienController(Entretien.statutEnum statut, int IdEntretien, int IdCandidat, int IdRecruter, Calendar Date) {
        this.statut=statut;
        this.IdCandidat=IdCandidat;
        this.IdRecruter=IdRecruter;
        this.Date=Date;
        this.IdEntretien=IdEntretien;
    }

    public Object PlanifierEntretienController(Calendar Date, int duree, int IdRecruter, int IdCandidat ) {


        PlanifierEntretien planifierEntretien= new PlanifierEntretien(Date, duree, IdRecruter, IdCandidat);
        planifierEntretien.execute();


        Entretien entretien = planifierEntretien.getEntretien();


        PlanifierEntretienController objetResponse=  new PlanifierEntretienController(
                entretien.getStatut(),
                entretien.getEntretienID().getId(),
                IdCandidat,
                IdRecruter,
                Date);
        return objetResponse;
    }
}