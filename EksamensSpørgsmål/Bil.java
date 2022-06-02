package EksamensSpørgsmål;

public class Bil {
    private Trailer trailer;
    private int vægt;

    public Bil(int vægt, Trailer trailer) {
        this.vægt = vægt;
        if(trailer.getVægt()+vægt <3500)
            this.trailer = trailer;



    }

    public int totalVægt() {

        if(trailer!=null)
        return vægt + trailer.vægt;
        else
            return vægt;
    }


    public Trailer getTrailer() {
        return trailer;
    }


}

