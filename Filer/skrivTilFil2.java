package Filer;

import java.io.File;
import java.io.PrintStream;

public class skrivTilFil2 {

    public void makeFile() throws Exception {
        //Opret fil
        File file = new File("navne.txt");
        PrintStream ps = new PrintStream(file);
        ps.println("Jaw");
    }

    public static void main(String[] args) throws Exception {
        new skrivTilFil2().makeFile();
    }
}
