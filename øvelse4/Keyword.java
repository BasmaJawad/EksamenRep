package øvelse4;

import java.util.ArrayList;

public class Keyword {

    private String word;
    private String definition;
    private String seeAlso;
    private ArrayList<String> keywords = new ArrayList<>();

    public boolean matches(String søgeord){
        if(word.equalsIgnoreCase(søgeord))
            return true;
        else{
            for(int i = 0; i < keywords.size(); i++) {
                System.out.println("Not found, here is another word " + keywords.get(i));
            }
        return false;
        }
    }

    public void addToList(){
        keywords.add("hej");
        keywords.add("vand");
        keywords.add("pc");
    }

    public static void main(String[] args) {
        Keyword k = new Keyword();
        k.addToList();
        k.word = "jo";
        System.out.println(k.matches("no"));

    }
}
