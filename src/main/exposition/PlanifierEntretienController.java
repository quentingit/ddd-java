package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.PlanifierEntretien;

import java.util.Calendar;


class PlanifierEntretienController {

    private Enum statut;
    private int IdRecruter;
    private int entretienID;
    private int IdCandidat;
    private Calendar Date;



    public PlanifierEntretienController(Calendar date, int duree, int IdCandidat, int IdRecruter, Calendar Date) {
        PlanifierEntretien planifierEntretien = new PlanifierEntretien(Date, duree,  IdRecruter,IdCandidat);
        planifierEntretien.execute();

        Entretien entretien = planifierEntretien.getEntretien();

        this.statut = entretien.getStatut();
        this.IdCandidat = entretien.getCandidat().getId();
        this.IdRecruter = entretien.getRecruteur().getRecruterId();
        this.Date = entretien.getCreneau().getDate();
        this.entretienID = entretien.getEntretienID().getId();

    }
}

