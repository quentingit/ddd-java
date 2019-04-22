package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.AnnulerEntretien;


import java.util.Calendar;

class AnnulerEntretienController {


        public AnnulerEntretienController() {

        }

        private Enum statut;
        private int IdRecruter;
        private int IdCandidat;
        private Calendar Date;

        //Constructeur pour notre objet response
        public AnnulerEntretienController(Entretien.statutEnum statut, int IdEntretien, int IdCandidat, int IdRecruter, Calendar Date) {
            this.statut=statut;
            this.IdCandidat=IdCandidat;
            this.IdRecruter=IdRecruter;
            this.Date=Date;
        }

        public AnnulerEntretienController AnnulerEntretienController(int IdEntretien) {

            // on cree un nouvel objet du use case Confirmer entretien
            AnnulerEntretien AnnulerEntretien= new AnnulerEntretien(IdEntretien);
            // on execute le nouvel objet crée
            AnnulerEntretien.execute();

            //on creer un objet entretien
            //on retourne dans cet objet un objet entretien qui remonte les couches precedentes
            Entretien entretien = AnnulerEntretien.getEntretien();


            //CREER NOTRE OBJET RESPONSE en appelant le constructeur
            //on recupere le statut de notre objet entretien , ainsi que l'id de l'entretien pour le passer en parametre
            AnnulerEntretienController objetResponse =  new AnnulerEntretienController(
                    entretien.getStatut(),
                    entretien.getEntretienID().getId(),
                    IdCandidat,
                    IdRecruter,
                    Date);

            //on retourne notre objet response
            return objetResponse;
    }
}