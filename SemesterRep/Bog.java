package SemesterRep;

public class Bog {

  private String titel;
  private int ISBN;
  private int udgivelsesår;

  // Constructor
  public Bog (String titel, int ISBN, int udgivelsesår){
    this.titel = titel;
    this.ISBN = ISBN;
    this.udgivelsesår = udgivelsesår;
  }

  // Setters
  public void setISBN(int ISBN) {
    this.ISBN = ISBN;
  }

  public void setTitel(String titel){
    this.titel = titel;

  }

  public void setUdgivelsesår(int udgivelsesår) {
    this.udgivelsesår = udgivelsesår;
  }

  // Getters

  public int getISBN (){
    return ISBN;
  }

  public String getTitel() {
    return titel;
  }

  public int getUdgivelsesår() {
    return udgivelsesår;
  }
  @Override

  public String toString(){
    return titel + "\n"+ ISBN + "\n" + udgivelsesår;
  }

}
