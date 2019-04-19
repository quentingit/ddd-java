package main.model;

public class Entretien {

    private int statut;
    private Creneau creneau;
    private Recruteur recruteur;
    private Candidat candidat;
    private EntretienID entretienID;


    public Entretien(){

        System.out.println("test");




    }

    public void confirmer(){
        this.statut=1;
    }

    public void annuler(String raison){
        this.statut=0;
    }

}
