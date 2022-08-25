package Filer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class skrivTilFil2 {

    /* public void makeFile() throws Exception {
        //Opret fil
        File file = new File("navne.txt");
        PrintStream ps = new PrintStream(file);
        ps.println("Jaw");
    }*/

    public void makeFile(){
        File file = new File("navne.txt");
        try {
            PrintStream p = new PrintStream(file);
            p.println("Nej");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }

    public static void main(String[] args) throws Exception {
        new skrivTilFil2().makeFile();
    }
}
