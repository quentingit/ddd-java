package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.ReplanifierEntretien;

import java.util.Calendar;

class ReplanifierEntretienController {

    private Enum statut;
    private int IdRecruter;
    private int entretienID;
    private int IdCandidat;
    private Calendar Date;


    public ReplanifierEntretienController(int IdEntretien, Calendar Date, int duree, int IdRecruter, int IdCandidat) {
        ReplanifierEntretien replanifierEntretien = new ReplanifierEntretien(IdEntretien, Date, duree, IdRecruter, IdCandidat);
        replanifierEntretien.execute();

        Entretien entretien = replanifierEntretien.getEntretien();

        this.statut = entretien.getStatut();
        this.IdCandidat = entretien.getCandidat().getId();
        this.IdRecruter = entretien.getRecruteur().getRecruterId();
        this.Date = entretien.getCreneau().getDate();
        this.entretienID = entretien.getEntretienID().getId();

    }



}