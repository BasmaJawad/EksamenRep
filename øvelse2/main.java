package øvelse2;

public class main {
    public static void main(String[] args) {
        Producer producer = new Producer("mike");
        Film film = new Film("titanic",1989);
        Film film1 = new Film("twilight");

        film.setProducer(producer);

        System.out.println(film);
        System.out.println(film1);
    }
}
