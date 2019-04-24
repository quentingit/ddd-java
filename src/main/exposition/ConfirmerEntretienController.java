package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.AnnulerEntretien;
import main.use_case.ConfirmerEntretien;
import main.use_case.PlanifierEntretien;

import java.util.Calendar;

class ConfirmerEntretienController {

    private Enum statut;

    public int getIdRecruter() {
        return IdRecruter;
    }

    public void setIdRecruter(int idRecruter) {
        IdRecruter = idRecruter;
    }

    private int IdRecruter;
    private int entretienID;
    private int IdCandidat;
    private Calendar Date;

    public Enum getStatut() {
        return statut;
    }

    public void setStatut(Enum statut) {
        this.statut = statut;
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

    public Entretien.statutEnum getStatus() {
        return status;
    }

    public void setStatus(Entretien.statutEnum status) {
        this.status = status;
    }

    private Entretien.statutEnum status;

    public ConfirmerEntretienController(int IdEntretien) {
        ConfirmerEntretien confirmerEntretien = new ConfirmerEntretien(IdEntretien);
        confirmerEntretien.execute();

        Entretien entretien = confirmerEntretien.getEntretien();

        this.statut = entretien.getStatut();
        this.IdCandidat = entretien.getCandidat().getId();
        this.IdRecruter = entretien.getRecruteur().getRecruterId();
        this.Date = entretien.getCreneau().getDate();
        this.entretienID = entretien.getEntretienID().getId();


    }
}