package Filer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class skrivTilFil {
    //man bruger PRINTSTREAM til at skrive til fil

    public static void main(String[] args)  {
        new skrivTilFil().run();
    }


    void run() {

        //OPRETTER EN FIL
        File fil = new File("test.txt");

        //DEFINERER PRINTSTREAM
        //når man bruger printStream skal man have en exeption metode: throw exeption ELLER try/catch

        try {
            PrintStream out = new PrintStream(fil); //printStream skal gælde for fil

            //SKRIVE TIL FILEN
            out.println("here is one line");
            out.println("here is another line\n");
            out.println("here is one line");
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");

        }



    }
}
