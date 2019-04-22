package main.infra;

import main.model.entretien.*;
import main.use_case.EntretienRepository;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EntretienRepositoryFake implements EntretienRepository {


    private Calendar date;
    private int heureDebut;
    private int heureFin;

    String [][][] entretiens = {
                 {
                         {"1"}, {"PLANIFIE"},{"2019-04-05-12-22", "1000","1200"}, {"1","Michael FERY", ".Net"	,"6", },{"1", "jean", "IOS", "5"}
                 },
                 {
                         {"2"}, {"PLANIFIE"},{"2019-04-05-12-22", "1000","1200"}, {"1", "laurent", ".NET", "10"},{"2", "marc", ".NET", "4"}
                },

    };






    @Override
    public Entretien getEntretienId(int id) {

        Entretien entretien = new Entretien();




        for(int i=0;i<entretiens.length;i++){


                EntretienID entretienId = new EntretienID(Integer.parseInt(String.valueOf(entretiens[i][0][0])));


                if (entretienId.getId() == id) {

                    System.out.println("good"+entretienId);


                    Candidat candidat = new Candidat(Integer.parseInt(entretiens[i][4][0]), entretiens[i][4][1], entretiens[i][4][2], Integer.parseInt(entretiens[i][4][3]));
                    Recruteur recruteur = new Recruteur(Integer.parseInt(entretiens[i][3][0]), entretiens[i][3][1], entretiens[i][3][2], Integer.parseInt(entretiens[i][3][3]));


                    Calendar calendar = new GregorianCalendar(2019,1,28,13,24);

                    Creneau creneau = new Creneau(calendar, Integer.parseInt(entretiens[i][2][1]), Integer.parseInt(entretiens[i][2][2]));
                    Entretien.statutEnum statut =    Entretien.statutEnum.valueOf(entretiens[i][1][0]);



                    return new Entretien(
                            statut,
                            creneau,
                            recruteur,
                            candidat,
                            entretienId);
                }


        }




        return entretien;



    }

    @Override
    public Entretien setEntretien(Entretien entretien) {
        return null;
    }


}
