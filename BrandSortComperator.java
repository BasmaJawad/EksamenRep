import java.util.Comparator;

public class BrandSortComperator implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) { //Compare brand i naturalorder
        return o1.getBrand().compareTo(o2.getBrand());
    }
}
