import java.io.PrintStream;

public class Car implements Comparable<Car>{

    private String model;
    private String brand;
    private FuelType fuelType;
    private int age;


    public Car(String model, String brand, FuelType fuelType, int age){
        this.model = model;
        this.brand = brand;
        this.fuelType=fuelType;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Car" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", fuelType=" + fuelType +
                ", age=" + age;
    }

    @Override
    public int compareTo(Car o) { //sortere model udefra hvilken bogstav der kommer først
        return this.model.compareTo(o.model);
        //return age -o.age;
    }

    public int getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
