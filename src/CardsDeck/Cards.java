package test;

public class Cards {

	 String rank;
     String suit;

    public String setRank(String rank) {
        this.rank = rank;
        return rank;
    }

    public String setSuit(String suit) {
        this.suit = suit;
        return suit;
    }

    public void drawCard() {
    	System.out.println("One card:");
        System.out.println("rank: "+rank+" "+ "suit: "+suit);
          
    }
}