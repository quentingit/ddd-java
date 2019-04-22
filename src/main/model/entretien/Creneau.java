package main.model.entretien;

import java.util.Calendar;

public class Creneau {

    private Calendar date;
    private int heureDebut;
    private int heureFin;

    public Creneau(Calendar date, int duree){


        this.date = date;
        this.heureDebut =  date.get(Calendar.MINUTE)*60 + date.get(Calendar.MINUTE);
        this.heureFin = heureDebut+duree  ;
    }


    public Creneau(Calendar date, int heureDebut, int heureFin){


        this.date = date;
        this.heureDebut =  heureDebut;
        this.heureFin = heureFin ;
    }


    public int getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(int heureFin) {
        this.heureFin = heureFin;
    }


    public int getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(int heureDebut) {
        this.heureFin = heureDebut;
    }

    public Calendar getDate() {
        return date;
    }
};



