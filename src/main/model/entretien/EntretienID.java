package main.model.entretien;

import java.util.Random;

public class EntretienID {

    private int id;

    public int getId() {
        return id;
    }


    public EntretienID(){
        Random rand = new Random();
        this.id =  rand.nextInt(9000000) + 1000000;
    }


    public EntretienID(int Id){
        this.id = id;
    }






}
