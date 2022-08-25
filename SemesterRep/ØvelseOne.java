package SemesterRep;
import java.util.ArrayList;

public class ØvelseOne {

  private ArrayList<String> array = new ArrayList<>();

  public void addItem() {
    array.add("hair");
    array.add("nose");
    array.add("ears");
    array.add("mouth");
    array.add("eyes");
    array.add("face");

  }

  public boolean doesArrayListContainString(ArrayList ar, String st) {
    if (ar.contains(st))
      return true;
    else {
      ar.add(st);
      return false;

    }
  }
  public void go(){
    addItem();
    System.out.println("Does array list contain String? " + doesArrayListContainString(array,"face"));


  }


  public static void main(String[] args) {
    new ØvelseOne().go();



  }


}
