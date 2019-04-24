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


    private Entretien entretien;

    public ReplanifierEntretien(int IdEntretien, Calendar Date, int duree, int IdRecruter, int IdCandidat) {
        this.IdEntretien = IdEntretien;
        this.Date = Date;
        this.duree = duree;
        this.IdRecruter = IdRecruter;
        this.IdCandidat = IdCandidat;
    }

    public void execute() {
        EntretienRepositoryFake entretienRepositoryFake = new EntretienRepositoryFake();
        this.entretien = entretienRepositoryFake.getEntretienId(this.IdEntretien);

        ConsultantRecruterService consultantRecruterService = new ConsultantRecruterServiceFake();
        Recruteur recruteur = consultantRecruterService.getRecruterId(this.IdRecruter);

        CandidatRepositoryFake CandidatRepositoryFake = new CandidatRepositoryFake();
        Candidat candidat = CandidatRepositoryFake.getCandidatByID(this.IdCandidat);

        entretien.replanifierEntretien(entretien, candidat, recruteur, Date, duree);

    }

    public Entretien getEntretien() {
        return entretien;
    }

    public void setEntretien(Entretien encctretien) {
        this.entretien = encctretien;
    }
}
