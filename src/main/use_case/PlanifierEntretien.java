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

    private Entretien entretien;


    public PlanifierEntretien(Calendar Date, int duree, int IdRecruter, int IdCandidat) {
        this.Date=Date;
        this.duree=duree;
        this.IdRecruter=IdRecruter;
        this.IdCandidat=IdCandidat;
    }

    public void execute() {

        EntretienRepositoryFake entretienRepositoryFake = new EntretienRepositoryFake();

        this.entretien = entretienRepositoryFake.getEntretienId(this.IdEntretien);

        ConsultantRecruterService consultantRecruterService = new ConsultantRecruterServiceFake();
        Recruteur recruteur = consultantRecruterService.getRecruterId(this.IdRecruter);


        CandidatRepositoryFake CandidatRepositoryFake = new CandidatRepositoryFake();
        Candidat candidat = CandidatRepositoryFake.getCandidatByID(this.IdCandidat);


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
