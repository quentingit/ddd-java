package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.PlanifierEntretien;
import main.use_case.ReplanifierEntretien;

import java.util.Calendar;

class ReplanifierEntretienController {
    public ReplanifierEntretienController() {

    }
    private Enum statut;
    private int IdRecruter;
    private int IdCandidat;
    private Calendar Date;
    private int IdEntretien;

    public ReplanifierEntretienController(Entretien.statutEnum statut, int IdEntretien, int IdCandidat, int IdRecruter, Calendar Date) {
        this.statut=statut;
        this.IdCandidat=IdCandidat;
        this.IdRecruter=IdRecruter;
        this.Date=Date;
        this.IdEntretien=IdEntretien;
    }

    public Object ReplanifierEntretienController(int IdEntretien, Calendar Date, int duree, int IdRecruter, int IdCandidat ) {

        ReplanifierEntretien replanifierEntretien= new ReplanifierEntretien(IdEntretien, Date, duree, IdRecruter, IdCandidat);
        replanifierEntretien.execute();


        Entretien entretien = replanifierEntretien.getEntretien();
        ReplanifierEntretienController objetResponse=  new ReplanifierEntretienController(
                entretien.getStatut(),
                entretien.getEntretienID().getId(),
                IdCandidat,
                IdRecruter,
                Date);

        return objetResponse;
    }


}