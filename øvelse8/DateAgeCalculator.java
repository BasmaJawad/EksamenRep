package øvelse8;

public class DateAgeCalculator {

    private int yourAge;
    private int dateAge;

    public DateAgeCalculator(int yourAge, int dateAge) {
        this.yourAge = yourAge;
        this.dateAge = dateAge;
    }

    public int calAge() {
        int lowest = (yourAge / 2) + 7;
        return lowest;
    }

    public String dateAgeIsOk() {
        if (dateAge > calAge())
            return "Date age is acceptable";
        else
            return "Date age is not acceptable";
    }


}
