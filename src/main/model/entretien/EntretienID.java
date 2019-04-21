package main.model.entretien;

import java.util.Random;

public class EntretienID {

    private int id;

    public int getId() {
        return id;
    }

    // si id existe pas , generation
    public EntretienID(){
        Random rand = new Random();
        this.id =  rand.nextInt(9000000) + 1000000;
    }

    //si ID existe
    public EntretienID(int Id){
        this.id = id;
    }






}
