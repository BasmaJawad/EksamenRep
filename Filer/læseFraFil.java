package Filer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class læseFraFil {
    public static void main(String[] args) throws FileNotFoundException {
        new læseFraFil().go();
    }

    public void go() throws FileNotFoundException {
        // Lav et nyt fil objekt som repræsenterer filen
        File file = new File("navne.text");
        // Lav en scanner, som modtager fil objektet
        Scanner fil = new Scanner(file);

        while(fil.hasNext()){
            System.out.println(fil.nextLine());
        }
        // hasNext() metode verificerer hvorvidt filen har en til line
        // nextLine() metoden læser og returner den næste line i filen
        //Alt dette sættes i en while loop.

    }
}
