package main.model;

import java.util.Calendar;

public class Creneau {

    private Calendar date;
    private int heureDebut;
    private int heureFin;

    public Creneau(Calendar date, int duree){

        //date.add(Calendar.HOUR_OF_DAY, 1); // adds one hour
        //date.getTime(); // returns new date object, one hour in the future
        //System.out.println(date.getTime());
        this.date = date;
        this.heureDebut =  date.get(Calendar.MINUTE)*60 + date.get(Calendar.MINUTE);
        this.heureFin = heureDebut+duree  ;
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



