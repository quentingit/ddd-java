package main.model.entretien;

import java.util.Calendar;

public class Entretien {

    private statutEnum statut = statutEnum.NONPLANIFIE;
    private Creneau creneau;
    private Recruteur recruteur;
    private Candidat candidat;
    private EntretienID entretienID;



    //enumeration du statut de l'entretien
    public enum statutEnum{
        NONPLANIFIE,
        PLANIFIE,
        EFFECTUE,
        REFUSEE,
        REPLANIFIE,
        CONFIRMER
    }

    public Entretien(){

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


    public Entretien planifierEntretien(Candidat canditat, Recruteur recruteur, Calendar Date, int duree){
        //on cree un nouvel objet entretien
        Entretien entretien= new Entretien();

        //On génére notre objet créneau
        this.creneau = new Creneau(Date, duree);

        //on planifie pour l'objet entretient un candidat et un recruteur
        this.candidat= canditat;
        this.recruteur= recruteur;

        //On genere un id unique (random) pour l'entretien
        this.entretienID= new EntretienID();

        //on doit mettre le statut
        this.statut=statutEnum.PLANIFIE;

        System.out.println("Statut: "+getStatut());

        return entretien;
    }



    public Entretien replanifierEntretien(Entretien entretien, Candidat canditat, Recruteur recruteur, Calendar Date, int duree) {

       //on recuperer l'objet entretien que l'on va modifié pour la replanification


        //On peut changer la date
        entretien.creneau = new Creneau(Date, duree);

        //on peut aussi changer le candidat et le recruteur
        entretien.candidat= canditat;
        entretien.recruteur= recruteur;

        //on doit mettre le statut
        entretien.statut = statutEnum.REPLANIFIE;

        return entretien;
    }


    public void annulerEntretien(Entretien entretien) {

        //on met a jour le statut mettre le statut
        this.statut=statutEnum.REFUSEE;

    }


    public void confirmerEntretien(Entretien entretien) {
          //on met a jour le statut
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
