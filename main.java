import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class main {

    public static void main(String[] args) {
        new main().run();
    }

    public void run(){

        Car car1 = new Car("Tesla","Brand",FuelType.DIESEL,20);
        Car car2 = new Car("Ford", "brand", FuelType.GASOLINE,3);


        //SORTERING I ARRAYS
       /* Car[] cars = new Car[2];
        cars[0]= car1;
        cars[1]=car2;

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars);
        System.out.println();

        System.out.println(Arrays.toString(cars)); //naturlig sorterting (model)*/


        //SORTERING I ARRAYLISTER
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        Collections.sort(cars); //Naturlig sortering
        Collections.sort(cars, new AgeSortComperator()); //sortering der overrider

        System.out.println(cars);
        System.out.println();


        //System.out.println(cars);





    }
}
