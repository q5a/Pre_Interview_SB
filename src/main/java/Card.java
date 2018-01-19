/**
 * Card class represents a Card object 
 * for use in the Card Deck class outlined in
 * deckofcards package.
 * 
 * Cards are initialized to a specified value
 * and suit, as outlined in enum types Suit and CardVal.
 * A default constructor is not defined in the class as 
 * there is no expectation of a Card being defined to any
 * default suit or value
 */

public class Card {
	
	//Holds the Suit and Card Value of the Card Object
	private Suit suit;
	private CardVal cardVal;
	
	/**
	 * Constructor for Card object.
	 * Constructor takes in arguments for 
	 * a Card Value and a Suit, and copies values
	 * to object parameters
	 * 
	 * @param cardVal
	 * @param suit
	 */
	
	public Card (CardVal cardVal, Suit suit){
		this.cardVal = cardVal;
		this.suit = suit;
	}
	
	/**
	 * get method for the Card object's Suit 
	 * @return
	 */
	
	public Suit getSuit(){
		return suit;
	}
	
	/**
	 * set method for the Card object's suit
	 * @param suit
	 */
	
	public void setSuit(Suit suit){
		this.suit = suit;
	}
	
	/**
	 * get method for the Card object's Card Value
	 * @return
	 */
	
	public CardVal getCardVal(){
		return cardVal;
	}
	
	/**
	 * set method for the Card object's Card Value
	 * @param cardVal
	 */
	
	public void SetCardVal(CardVal cardVal){
		this.cardVal = cardVal;
	}
	
	/**
	 * Overridden toString method for use in 
	 * sending Card objects to System.out 
	 */
	
	@Override
	public String toString(){
		return cardVal + " of " + suit;
	}
}
