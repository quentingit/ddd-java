package main.exposition;

import main.model.entretien.Creneau;
import main.model.entretien.Entretien;
import main.model.entretien.EntretienID;
import main.use_case.AnnulerEntretien;


import java.util.Calendar;

class AnnulerEntretienController {
        private Enum statut;
        private int IdRecruter;
        private int entretienID;
        private int IdCandidat;
        private Calendar Date;

        public AnnulerEntretienController(int IdEntretien) {
            AnnulerEntretien AnnulerEntretien= new AnnulerEntretien(IdEntretien);
            AnnulerEntretien.execute();

            Entretien entretien = AnnulerEntretien.getEntretien();

            this.statut= entretien.getStatut();
            this.IdCandidat=entretien.getCandidat().getId();
            this.IdRecruter=entretien.getRecruteur().getRecruterId();
            this.Date=entretien.getCreneau().getDate();
            this.entretienID=entretien.getEntretienID().getId();
    }



    public Calendar getDate(){
        return Date;
    }

    public int getIdCandidat(){
        return IdCandidat;
    }


    public int getIdRecruter(){
        return IdRecruter;
    }

    public Enum getStatut() {
        return statut;
    }

    public void setStatut(Enum statut) {
        this.statut = statut;
    }

    public int getEntretienID() {
        return entretienID;
    }

}