package EksamensRep;

public class opretObj {
    // ATTRIBUTTER
    private String name;
    private int age;
    // Konstruktør
    public opretObj(String name, int age){
    this.name = name;
    this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
        }

    @Override
    //toString er en metode i java. Bruges til at printe et objekt
    public String toString() {
        return name + " " + age;
    }
    //Overload
    public void cal(int age){
        int tal = age+3;
        System.out.println(tal);

    }
    public void cal(){
        int tal = age+3;
        System.out.println(tal);
    }




}

