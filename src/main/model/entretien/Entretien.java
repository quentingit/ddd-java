package main.model.entretien;

import java.util.Calendar;

public class Entretien {

    private statutEnum statut;
    private Creneau creneau;
    private Recruteur recruteur;
    private Candidat candidat;
    private EntretienID entretienID;


    //enumeration du statut de l'entretien
    enum statutEnum{
        NONPLANIFIE,
        PLANIFIE,
        EFFECTUE,
        REFUSEE,
        REPLANIFIE
    }

    public Entretien(){

        System.out.println("test");


    }


    /**********************************************************/


    public Entretien planifierEntretien(Candidat canditat, Recruteur recruteur, Calendar Date, int duree){
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

        return entretien;
    }




    public Entretien AnnulerEntretien(Candidat canditat) {
        Entretien entretien= new Entretien();

        return entretien;
    }


    public Entretien ReplanifierEntretien(Candidat canditat) {
        Entretien entretien= new Entretien();

        return entretien;
    }


    public Entretien ConfirmerEntretien(Candidat canditat) {
        Entretien entretien= new Entretien();

        return entretien;
    }




}
