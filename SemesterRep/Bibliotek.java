package SemesterRep;

import java.util.ArrayList;
import java.util.Arrays;

public class Bibliotek {

  private ArrayList<Bog>BookList = new ArrayList<>();

  Bog book1 = new Bog("Mad", 12345, 2020);
  Bog book2 = new Bog("Apple", 67890, 2021);
  Bog book3 = new Bog("Pan", 10293, 2022);
  Bog book4 = new Bog("Mad", 1245, 2020);

  public void addBooks(){
    BookList.add(book1);
    BookList.add(book2);
    BookList.add(book3);

  }

  public boolean seeIfBookIsThere(Bog book) {
    for (int i = 0; i < BookList.size(); i++) {
      if (book.getISBN() == BookList.get(i).getISBN())
        return true;
    }
    return false;
  }

  public void go(){
    addBooks();
    System.out.println("see if book is there "+ seeIfBookIsThere(book4));
  }


  public static void main(String[] args) {
    new Bibliotek().go();

  }
}
