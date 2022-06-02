package Øvelse5;

public class Card {
    private String suit;
    private int value;

    public void beats(int newValue, String newSuit){
        if(value < newValue) {
            switch (newSuit){
                case "hearts":
                    System.out.println("congrats - your card has beaten the other card");
                    break;
                case "clubs":
                    if(suit.equals("spades"))
                    break;
                case "diamonds":
                    if (suit.equals("clubs")||suit.equals("diamonds"))
                        System.out.println("congrats - your card has beaten the other card");
                    break;

                default: System.out.println("your card has lost");
            }
        } else
            System.out.println( " Sorry it does not beat the card");
    }

    public static void main(String[] args) {
        Card card = new Card();
        card.suit = "diamond";
        card.value = 2;
        card.beats(10,"diamond");
    }

}
