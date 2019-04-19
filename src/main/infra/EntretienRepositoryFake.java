package main.infra;

import main.model.entretien.*;
import main.use_case.EntretienRepository;

import java.util.Calendar;

public class EntretienRepositoryFake implements EntretienRepository {



    //on cree notre liste de candidats

    private Calendar date;
    private int heureDebut;
    private int heureFin;



    String [][][] entretiens = {
                 {
                     {"PLANIFIE"},{"2019-04-05-12-22", "1000","1200"}, {"1","Michael FERY","process", ".Net"	,"6", ""},{"1", "jean", "IOS", "5"}, {"1"}
                 },
                 {
                     {"PLANIFIE"},{"2019-04-05-12-22", "1000","1200"}, {"1", "laurent", ".NET", "", "10", ""},{"2", "marc", ".NET", "4"}, {"2"}
                },

    };






    @Override
    public Entretien getEntretienId(int id) {

        Entretien entretien = new Entretien();
        return entretien;


    }

    @Override
    public Entretien setEntretien(Entretien entretien) {
        return null;
    }


}
