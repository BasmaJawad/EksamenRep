package SemesterRep;

import java.util.Scanner;

public class kvadrat {


    public static void main(String[] args) {
        new kvadrat().go();
    }

    public void go(){
        askNum();
    }


    public void askNum(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = in.nextInt();

        System.out.print("Enter symbol: ");
        String symbol = in.next();

        printKvadrat(num,symbol);

    }

    public void printKvadrat(int num, String symbol){

        for(int i =1; i<=num; ++i) {
            for (int j = 1; j <= num; ++j) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }

    }


}
