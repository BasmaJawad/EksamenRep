package øvelse1;

import java.util.ArrayList;

public class Tekst {

    ArrayList<String> tekstlinjer = new ArrayList<>();


    public void tilføj(String tekst){
        tekstlinjer.add(tekst);
    }

    public int findAntalUnikke(){
        return tekstlinjer.size();
    }
}
