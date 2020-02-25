package test;

public class ResultDeck {

	public static void main(String[] args) {

		Deck d = new Deck();
		d.drawCardDeck();
		
		Cards c = new Cards();
			
		
		c.setRank("1");
		c.setSuit("clubs");
		c.drawCard();
		
	}

}
