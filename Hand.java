public class Hand { //constructor
	
	Card hand = new Card("","",1); //compilation from 
	int totalPV = 0;
	
	Hand() {
		for(int x=0;x<hand.length;x++)
			totalPV+=hand.getPointValue();
	}	
	
	public Card toString() { //displays hand
		
		for(int x=0;x<hand.length;x++)
			return hand;
	}
	
	public int getTotalPoints()
	{
		return totalPV;
	}

}