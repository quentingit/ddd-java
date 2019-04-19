package model.entretien;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class CreneauTest {

    @Test
    public void getHeureFin() {



    }

    @Test
    public void getHeureDebut() {
    }

    @Test
    public void getDate() {

        Calendar cal = Calendar.getInstance(); // creates calendar
        cal.setTime(new Date()); // sets calendar time/date
        Creneau creneau= new Creneau(cal, 60 );

        System.out.println(creneau.getDate().getTime());
        assertThat(creneau.getDate().getTime()).isEqualTo("2002-12-18");


    }




//NE DOIT PAS ETRE SUR LE MEME HORAIRE


}
