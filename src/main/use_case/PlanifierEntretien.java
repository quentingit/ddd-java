package main.use_case;

import main.infra.CandidatRepositoryFake;
import main.infra.ConsultantRecruterServiceFake;
import main.infra.EntretienRepositoryFake;
import main.model.entretien.Candidat;
import main.model.entretien.Entretien;
import main.model.entretien.Recruteur;

import java.util.Calendar;


public class PlanifierEntretien {


    private  Calendar Date;
    private int duree;
    private int IdRecruter;
    private int IdCandidat;
    private int IdEntretien;
    //Valeur de sortie
    private Entretien entretien;


    public PlanifierEntretien(Calendar Date, int duree, int IdRecruter, int IdCandidat) {
        this.Date=Date;
        this.duree=duree;
        this.IdRecruter=IdRecruter;
        this.IdCandidat=IdCandidat;
    }

    public void execute() {
        //on recupere les champs liés au candidat demandé
        EntretienRepositoryFake entretienRepositoryFake = new EntretienRepositoryFake();
        //on donne à l'attribut objet entretien les valeurs pour la requete en base lié a à l'id
        this.entretien = entretienRepositoryFake.getEntretienId(this.IdEntretien);
        //on recupere les champs liés au recruteur demandé
        ConsultantRecruterService consultantRecruterService = new ConsultantRecruterServiceFake();
        Recruteur recruteur = consultantRecruterService.getRecruterId(this.IdRecruter);

        //on recupere les champs liés au candidat demandé
        CandidatRepositoryFake CandidatRepositoryFake = new CandidatRepositoryFake();
        Candidat candidat = CandidatRepositoryFake.getCandidatByID(this.IdCandidat);

        //Entree :On passe par l'agregate root Entretien en lui passant un candidat en parametre
        //Action : on planigie l'entretien
        //Sortie: on recupere alors un objet de type entretien
        entretien.planifierEntretien(candidat, recruteur, Date, duree);
    }



    /*********************************************************************************/


    public Calendar getDate() {
        return Date;
    }

    public void setDate(Calendar date) {
        Date = date;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getIdRecruter() {
        return IdRecruter;
    }

    public void setIdRecruter(int idRecruter) {
        IdRecruter = idRecruter;
    }

    public int getIdCandidat() {
        return IdCandidat;
    }

    public void setIdCandidat(int idCandidat) {
        IdCandidat = idCandidat;
    }

    public Entretien getEntretien() {
        return entretien;
    }

    public void setEntretien(Entretien entretien) {
        this.entretien = entretien;
    }
}
