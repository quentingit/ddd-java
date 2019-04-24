package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.PlanifierEntretien;

import java.util.Calendar;


class PlanifierEntretienController {

    public Enum getStatut() {
        return statut;
    }

    public void setStatut(Enum statut) {
        this.statut = statut;
    }

    public int getIdRecruter() {
        return IdRecruter;
    }

    public void setIdRecruter(int idRecruter) {
        IdRecruter = idRecruter;
    }

    public int getEntretienID() {
        return entretienID;
    }

    public void setEntretienID(int entretienID) {
        this.entretienID = entretienID;
    }

    public int getIdCandidat() {
        return IdCandidat;
    }

    public void setIdCandidat(int idCandidat) {
        IdCandidat = idCandidat;
    }

    public Calendar getDate() {
        return Date;
    }

    public void setDate(Calendar date) {
        Date = date;
    }

    private Enum statut;
    private int IdRecruter;
    private int entretienID;
    private int IdCandidat;
    private Calendar Date;



    public PlanifierEntretienController(Calendar date, int duree, int IdCandidat, int IdRecruter) {
        PlanifierEntretien planifierEntretien = new PlanifierEntretien(date, duree,  IdRecruter,IdCandidat);
        planifierEntretien.execute();

        Entretien entretien = planifierEntretien.getEntretien();

        this.statut = entretien.getStatut();
        this.IdCandidat = entretien.getCandidat().getId();
        this.IdRecruter = entretien.getRecruteur().getRecruterId();
        this.Date = entretien.getCreneau().getDate();
        this.entretienID = entretien.getEntretienID().getId();

    }
}

