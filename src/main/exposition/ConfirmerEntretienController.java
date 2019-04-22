package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.ConfirmerEntretien;
import main.use_case.PlanifierEntretien;

import java.util.Calendar;

class ConfirmerEntretienController {

    private Enum statut;
    private int IdRecruter;
    private int IdCandidat;
    private Calendar Date;


    public ConfirmerEntretienController(Entretien.statutEnum statut,int IdEntretien, int IdCandidat, int IdRecruter, Calendar Date) {
        this.statut=statut;
        this.IdCandidat=IdCandidat;
        this.IdRecruter=IdRecruter;
        this.Date=Date;
    }

    public Object ConfirmerEntretienController(int IdEntretien) {

        ConfirmerEntretien confirmerEntretien= new ConfirmerEntretien(IdEntretien);
        confirmerEntretien.execute();

        Entretien entretien = confirmerEntretien.getEntretien();

        ConfirmerEntretienController objetResponse=  new ConfirmerEntretienController(
                entretien.getStatut(),
                entretien.getEntretienID().getId(),
                IdCandidat,
                IdRecruter,
                Date);

        return objetResponse;
    }
}