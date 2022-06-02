package EksamensRep;

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
    }

}
