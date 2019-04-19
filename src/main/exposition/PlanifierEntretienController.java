package main.exposition;

import main.model.entretien.Entretien;
import main.use_case.PlanifierEntretien;

import java.util.Calendar;

class PlanifierEntretienController {
    private Enum statut;
    private int IdRecruter;
    private int IdCandidat;
    private Calendar Date;
    private int IdEntretien;

    //Constructeur pour notre objet response
    public PlanifierEntretienController(Entretien.statutEnum statut, int IdEntretien, int IdCandidat, int IdRecruter, Calendar Date) {
        this.statut=statut;
        this.IdCandidat=IdCandidat;
        this.IdRecruter=IdRecruter;
        this.Date=Date;
        this.IdEntretien=IdEntretien;
    }

    public Object PlanifierEntretienController(Calendar Date, int duree, int IdRecruter, int IdCandidat ) {

        // on cree un nouvel objet du use case Planifier entretien
        PlanifierEntretien planifierEntretien= new PlanifierEntretien(Date, duree, IdRecruter, IdCandidat);
        // on execute le nouvel objet crée
        planifierEntretien.execute();

        //on creer un objet entretien
        //on retourne dans cet objet un objet entretien qui remonte les couches precedentes
        Entretien entretien = planifierEntretien.getEntretien();

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