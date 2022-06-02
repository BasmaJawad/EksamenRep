package øvelse2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Film {

    private Producer producer;

    private String filmTitel;
    private int udgivelsesår;

    public Film(String filmTitel, int udgivelsesår){
        this.filmTitel=filmTitel;
        this.udgivelsesår=udgivelsesår;
    }

    public Film (String filmTitel){
        this.filmTitel = filmTitel;
        udgivelsesår = LocalDate.now().getYear();
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Film{" +
                "producer=" + producer +
                ", filmTitel='" + filmTitel + '\'' +
                ", udgivelsesår=" + udgivelsesår +
                '}';
    }
}
