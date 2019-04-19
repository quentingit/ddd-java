package main.use_case;

import main.infra.EntretienRepositoryFake;
import main.model.entretien.Candidat;
import main.model.entretien.Entretien;

import java.util.Calendar;

public class ConfirmerEntretien {


    private int IdEntretien;

    //Valeur de sortie
    private Entretien entretien;

    public ConfirmerEntretien(int IdEntretien) {
            this.IdEntretien=IdEntretien;

    }
    public void execute() {

        //on cherche dans la bdd l'entretien qui correspond à l'id
        //on recupere les champs liés au candidat demandé
        EntretienRepositoryFake entretienRepositoryFake = new EntretienRepositoryFake();
        //on donne à l'attribut objet entretien les valeurs pour la requete en base lié a à l'id
        this.entretien = entretienRepositoryFake.getEntretienId(this.IdEntretien);

        //on change ensuite le statut
        entretien.ConfirmerEntretien(entretien);

        //on reinsere en base l'entretien avec le nouveau statut
        entretienRepositoryFake.setEntretien(entretien);
    }

    public Entretien getEntretien() {
        return entretien;
    }

}
