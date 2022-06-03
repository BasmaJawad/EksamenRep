package EksamensRep;

public class oop {
    public static void main(String[] args) {
        //OPRET OBJEKT
        opretObj op = new opretObj("Basma",19);
        System.out.println(op);
        //overload
        op.cal();
        op.cal(2);
    }


}
