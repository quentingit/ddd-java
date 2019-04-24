package main.model.entretien;

import java.util.Calendar;

public class Entretien {

    private statutEnum statut = statutEnum.NONPLANIFIE;
    private Creneau creneau;
    private Recruteur recruteur;
    private Candidat candidat;
    private EntretienID entretienID;



    public enum statutEnum{
        NONPLANIFIE,
        PLANIFIE,
        EFFECTUE,
        REFUSEE,
        REPLANIFIE,
        CONFIRMER
    }


    public Entretien(statutEnum statut,
                     Creneau creneau,
                     Recruteur recruteur,
                     Candidat candidat,
                     EntretienID entretienID){

        this.statut=statut;
        this.creneau=creneau;
        this.recruteur=recruteur;
        this.candidat=candidat;
        this.entretienID=entretienID;
    }


    /**********************************************************/


    public Entretien planifierEntretien(Entretien entretien, Candidat canditat, Recruteur recruteur, Calendar Date, int duree){

        entretien.creneau = new Creneau(Date, duree);
        entretien.candidat= canditat;
        entretien.recruteur= recruteur;
        entretien.entretienID= new EntretienID();
        entretien.statut=statutEnum.PLANIFIE;
        return entretien;
    }


    public Entretien replanifierEntretien(Entretien entretien, Candidat canditat, Recruteur recruteur, Calendar Date, int duree) {
        entretien.creneau = new Creneau(Date, duree);
        entretien.candidat= canditat;
        entretien.recruteur= recruteur;
        entretien.statut = statutEnum.REPLANIFIE;
        return entretien;
    }


    public void annulerEntretien(Entretien entretien) {
        this.statut=statutEnum.REFUSEE;
    }


    public void confirmerEntretien(Entretien entretien) {
        this.statut=statutEnum.CONFIRMER;
    }


    /***********************************************************************/
    public statutEnum getStatut() {
        return statut;
    }

    public Creneau getCreneau() {
        return creneau;
    }

    public void setCreneau(Creneau creneau) {
        this.creneau = creneau;
    }

    public Recruteur getRecruteur() {
        return recruteur;
    }

    public void setRecruteur(Recruteur recruteur) {
        this.recruteur = recruteur;
    }

    public Candidat getCandidat() {
        return candidat;
    }

    public void setCandidat(Candidat candidat) {
        this.candidat = candidat;
    }

    public EntretienID getEntretienID() {
        return entretienID;
    }

    public void setEntretienID(EntretienID entretienID) {
        this.entretienID = entretienID;
    }




}
