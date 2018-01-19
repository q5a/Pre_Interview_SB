/**
 *
 * The following enum class defines the card values
 * available for cards in the CardDeck object. The values
 * range from 2 - 10 for integer face card values, and the 
 * Ace, Jack, Queen, and King card values, mapped to integers
 * 14, 11, 12, and 13, respectively.  
 */

public enum CardVal {

	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);
	
	/**
	 * Holds the cardVal enum.
	 */
	private int cardVal;
	
	/**
	 * Constructor for the CardVal object.
	 * @param val
	 */
	private CardVal(int val){
		this.cardVal = val;
	}
	
	/**
	 * get method for the cardVal.
	 * @return
	 */
	public int getCardVal(){
		return cardVal;
	}
}
