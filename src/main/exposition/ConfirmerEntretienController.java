package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.AnnulerEntretien;
import main.use_case.ConfirmerEntretien;
import main.use_case.PlanifierEntretien;

import java.util.Calendar;

class ConfirmerEntretienController {

    private Enum statut;
    private int IdRecruter;
    private int entretienID;
    private int IdCandidat;
    private Calendar Date;

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