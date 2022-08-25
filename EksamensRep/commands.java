package EksamensRep;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class commands {

    //Lægge 2 strings sammen:
    String str = "Basma" + "Jaw";

    public void printF(){
        /*styr på printf
        ‰c - char
        %d - int
        %s - string
        %f - double
        %B - boolean
         */

        System.out.printf("hej %s",str);
    }

    public void indexOf(){

        //index of returnere en int
        String s = "hej";

        System.out.println(s.indexOf("h"));

        String a = "Hello World im here";

        System.out.println(a.indexOf("e",5));  //finder index af e, efter index 5
    }

    void subString(){

        String word = "skole";

        String sub1 = word.substring(2);
        String sub2 = word.substring(1,3);  //index 3 tæller ikke med
        System.out.println(sub1+" "+ sub2);
    }
    void charAt(){
        String kage = "kage";

        //charAt returnere char til et given index
        System.out.println(kage.charAt(3));
    }
    void conditions() {

        String h = "hej";
        if (h.equalsIgnoreCase("HEJ"))
            System.out.println("true");
        else
            System.out.println("false");

        switch (h) {
            case "hej" -> System.out.println("true");
            case "HEJ" -> System.out.println("true");
            default -> System.out.println("false");
        }
    }
    void parametre(int i, String s){
        //metode der modtager parametre

        int nyI= 3+ i;
        String nyS = "hej" + s;

        System.out.println(nyI+ " "+nyS);


    }
    
    //RETURN VÆRDIER
    int returnInt(){
        return 3;
    }
    String returnString(){
        return "hej";
    }
    Boolean returnBool(){
        return true;
    }
    double returnDoub(){
        return 3.4;
    }
    char returnChar(){
        return 'b';
    }

    // LOOPS
    void whileLoop() {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
    void doWhileLoop(){
        // Kører mindst 1x uden at tjekke
        // Kører efterfølgende hvis condition er sand
         int i = 10;
         do{
             System.out.println(i);
             i++;
         } while (i < 5);
    }
    void forLoop(){

        ArrayList<Integer> tal = new ArrayList<>();
        tal.add(1);
        tal.add(2);
        tal.add(4);
        tal.add(5);
        Collections.addAll(tal,6,7,8,9);

        for (int i = 0; i < tal.size(); i++) {
            System.out.println(tal.get(i));

            if(tal.get(i)==7)
                break;
        }
        System.out.println(tal);


       // for(int i: tal){
       //     System.out.println(i);
      //  }
    }
    void forEach(){
        String[] names = {"b","cc","j"};

        for(String i: names){
            System.out.println(i);
        }
    }
    
    void nestedLoops(){
        
        int weeks = 3;
        int days =7;
        
        for (int i = 1; i <= weeks ; i++) {
            System.out.println("week " +i); //printer en uge

            for (int j = 1; j <= days ; j++) { // udprinter en dag
                System.out.println("day " + j);
                
            }
        }}
        
    void Arrays(){

        String[] cars = {"Mustang", "Audi", "Mercerdes", "Volvo", "Mazda"};
            // index
            System.out.println(cars[2] + cars.length);
            // replace element
            cars[3] = "maybach";
            System.out.println(cars[3]);

            //find bestemt element i array
            for (int i = 0; i < cars.length; i++) {
                if(cars[i].equalsIgnoreCase("Audi")){
                    System.out.println(i);
                break;
                }

            }

            //UDSKRIV ARRAY
            System.out.println(Arrays.toString(cars));

            //CASTE TIL ARRAYLIST2
        List nyliste = Arrays.asList(cars);

        //ARRAYLISTER UDSKRIVES NEMT
        System.out.println(nyliste);


        }


        void arrayList(){
        //forskel: arrays har en bestemt størrelse, arraylister har ikke

            ArrayList<Integer> tal = new ArrayList<>();
            //TILFØJE TIL ARRAYLIST
            Collections.addAll(tal,2,3,4,5,6,7);

            //REMOVE FROM ARRAYLIST ved index
            tal.remove(0);

            //REMOVE ved at finde tal
            for (int i = 0; i < tal.size(); i++) {
                if(tal.get(i)==3)
                    tal.remove(i);
            }
            //REPLACE: vi replacer index 0, med talle 4
            tal.set(0,4);

            //CLEAR arraylis
            //tal.clear();

            //UDSKRIVE ARRAYLIST
            System.out.println(tal);

            //Udskriv et bestemt tal
            for (int i = 0; i < tal.size(); i++) {
                if(tal.get(i)==4)
                    System.out.println(tal.get(i));
            }    }



    void genererics(){

               //Generics: Her skal man skrive hvilken datatype Arraylisten kan modtage f.eks.
               // ArrayList<String> names = new Arraylist<>();
               //Den er af typen String,
               //Non generics ->

            List name = new ArrayList<>();
            name.add(10);
            name.add("basma");

               System.out.println(name);

        }






    public static void main(String[] args) {
        commands c = new commands();
        c.printF();
        System.out.println();
       c.indexOf();
        c.subString();
        c.charAt();
        c.conditions();
        c.parametre(5,"nej");
        c.whileLoop();
        c.doWhileLoop();
        c.forLoop();
        c.forEach();
       c.nestedLoops();
        c.Arrays();
        c.arrayList();
        c.genererics();

    }

}
