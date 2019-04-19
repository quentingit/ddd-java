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

    //Constructeur pour notre objet response
    public ConfirmerEntretienController(Entretien.statutEnum statut, int IdCandidat, int IdRecruter, Calendar Date) {
        this.statut=statut;
        this.IdCandidat=IdCandidat;
        this.IdRecruter=IdRecruter;
        this.Date=Date;
    }

    public Object ConfirmerEntretienController(int IdEntretien) {

        // on cree un nouvel objet du use case Confirmer entretien
        ConfirmerEntretien confirmerEntretien= new ConfirmerEntretien(IdEntretien);
        // on execute le nouvel objet crée
        confirmerEntretien.execute();

        //on creer un objet entretien
        //on retourne dans cet objet un objet entretien qui remonte les couches precedentes
        Entretien entretien = confirmerEntretien.getEntretien();


        //CREER NOTRE OBJET RESPONSE en appelant le constructeur
        //on recupere le statut de notre objet entretien , ainsi que l'id de l'entretien pour le passer en parametre
        PlanifierEntretienController objetResponse=  new PlanifierEntretienController(
                entretien.getStatut(),
                entretien.getEntretienID().getId(),
                IdCandidat,
                IdRecruter,
                Date);

        //on retourne notre objet response
        return objetResponse;
    }
    }


}