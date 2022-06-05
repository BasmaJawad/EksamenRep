package EksamensRep;

public abstract class Human {
    protected String name;
    protected int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    //ABSTRACT METHODS
    // en abstract metode har ikke en body. Skal inforces i en subklasse
    public abstract void saysHi();

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
