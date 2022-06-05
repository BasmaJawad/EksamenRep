package EksamensRep;
//abstrakte klasser hjælper med at håndhæve og organiserer helt præcist hvad enhver subklasse skal indeholde.
// Man må gerne
public abstract class Human {
    protected String name;
    protected int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    //ABSTRACT METHODS
    // en abstract metode har ikke en body. Skal enforces i en subklasse
    public abstract void saysHi();


    public void saysName(){
        System.out.println("My name is " + name);

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}
