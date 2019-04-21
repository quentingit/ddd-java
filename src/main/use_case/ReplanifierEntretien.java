package main.use_case;

import main.infra.CandidatRepositoryFake;
import main.infra.ConsultantRecruterServiceFake;
import main.infra.EntretienRepositoryFake;
import main.model.entretien.Candidat;
import main.model.entretien.Entretien;
import main.model.entretien.Recruteur;

import java.util.Calendar;

public class ReplanifierEntretien {
    private Calendar Date;
    private int duree;
    private int IdRecruter;
    private int IdCandidat;

    private int IdEntretien;

    //Valeur de sortie
    private Entretien entretien;


    public ReplanifierEntretien(int IdEntretien, Calendar Date, int duree, int IdRecruter, int IdCandidat) {
        this.IdEntretien = IdEntretien;
        this.Date = Date;
        this.duree = duree;
        this.IdRecruter = IdRecruter;
        this.IdCandidat = IdCandidat;
    }

    public void execute() {

        //on cherche dans la bdd l'entretie
        // n qui correspond à l'id
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


        //Action : //on change ensuite l'objet avec la nouelle date, nouveau candiddat, recruteur si besoin est
        //Sortie: on recupere alors un objet de type entretien
        entretien.replanifierEntretien(entretien, candidat, recruteur, Date, duree);


    }

    public Entretien getEntretien() {
        return entretien;
    }

    public void setEntretien(Entretien encctretien) {
        this.entretien = encctretien;
    }
}
