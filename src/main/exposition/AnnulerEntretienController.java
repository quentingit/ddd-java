package main.exposition;

import main.model.entretien.Creneau;
import main.model.entretien.Entretien;
import main.model.entretien.EntretienID;
import main.use_case.AnnulerEntretien;


import java.util.Calendar;

class AnnulerEntretienController {


        public AnnulerEntretienController() {

        }

        private Enum statut;
        private int IdRecruter;
        private EntretienID entretienID;
        private int IdCandidat;
        private Calendar Date;

        public AnnulerEntretienController(Entretien.statutEnum statut, int IdEntretien, int IdCandidat, int IdRecruter, Calendar Date) {
            this.statut=statut;
            this.IdCandidat=IdCandidat;
            this.IdRecruter=IdRecruter;
            this.Date=Date;
            this.entretienID= new EntretienID();
        }

        public AnnulerEntretienController AnnulerEntretienController(int IdEntretien) {

            AnnulerEntretien AnnulerEntretien= new AnnulerEntretien(IdEntretien);
            AnnulerEntretien.execute();


            Entretien entretien = AnnulerEntretien.getEntretien();
            AnnulerEntretienController objetResponse =  new AnnulerEntretienController(
                    entretien.getStatut(),
                    entretien.getEntretienID().getId(),
                    IdCandidat,
                    IdRecruter,
                    Date);

            return objetResponse;
    }
}