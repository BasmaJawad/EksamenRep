import java.util.Comparator;

public class AgeSortComperator implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        return o1.getAge()-o2.getAge(); //sorter med det laveste tal
       // return o2.getAge()-o1.getAge(); //sorter med det højeste tal
    }
}
