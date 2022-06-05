package Filer;

import java.util.Scanner;

public class læseFraFil {
    public static void main(String[] args) {
        new læseFraFil().go();
    }

    public void go(){

        //når vi allerede har en fil

        Scanner fil = new Scanner("test.txt");

        while(fil.hasNext()){
            System.out.println(fil.nextLine());
        }
    }
}
