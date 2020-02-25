package test;

public class Deck {
	String[] suits = {"spades", "clubs", "hearts", "diamonds"};
	String[] ranks = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};

	    public void drawCardDeck() {
	    	System.out.println("Full deck:");
	    	    for (int i = 0; i < suits.length; i++) {
	        	for (int j = 0; j < ranks.length; j++) {
	        		System.out.println(suits[i]+" "+ranks[j]);
	         	}	
	        }
	}
}
