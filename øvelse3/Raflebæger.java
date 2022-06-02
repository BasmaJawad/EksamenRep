package øvelse3;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {

    private int antalTerninger;
    private ArrayList<Integer> terningØjne = new ArrayList<>();


    public Raflebæger(int antalTerninger){
        this.antalTerninger = antalTerninger;
    }

    public int ryst(){
        int øjne;

        Random random = new Random();
        int count =0;


        for (int i = 0; i <=antalTerninger ; i++) {
            øjne = random.nextInt(6)+1;
            terningØjne.add(øjne);
            count = count + øjne;
        }

        return count;

    }
    public ArrayList<Integer> se(){
        return terningØjne;
    }

    public void printSe(){
        System.out.println(se());
    }
}
