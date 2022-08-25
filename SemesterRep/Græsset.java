package SemesterRep;

import java.util.Scanner;

public class Græsset {
  // Hvornår skal græsset slås?


    public static void main(String[] args) {
        new Græsset().go();
    }

    public void go(){
        spørgOmMål();
    }


    public double daysToSlåGræs(double målNu, double slutMål){
        double mål =(slutMål-målNu)/0.8;
        return Math.round(mål);
    }


    public void spørgOmMål(){

        double målNu;
        double slutmål;
        Scanner in = new Scanner(System.in);

        System.out.print("Indtast nuværende græsmål: ");
        målNu = in.nextDouble();

        System.out.print("Indtast det øsnkede længde: ");
        slutmål = in.nextDouble();


        System.out.println("Antal dage tilbage til at slå græs: "+daysToSlåGræs(målNu,slutmål) + " dage");






    }


}
