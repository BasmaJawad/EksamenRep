package øvelse1;

public class main {
    public static void main(String[] args) {
        Tekst tekst = new Tekst();
        tekst.tilføj("hje");
        tekst.tilføj("msdf");

        System.out.println(tekst.findAntalUnikke());
    }
}
