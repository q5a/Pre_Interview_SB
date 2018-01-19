/**
 * CardDeck class is the class that
 * represents a deck of cards object,
 * with N cards in the deck, with 0 <= N <= 52
 * 
 * Decks of cards are initialized with 52 cards,
 * representing a standard deck of cards with four suits.
 * Decks are initialized in a sorted order.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CardDeck {
	
	// Holds the ArrayList with Card objects
	private ArrayList<Card> deck;
	
	/*****************************************************
	 * Default constructor for CardDeck object.
	 * constructor initializes an ArrayList with
	 * Card objects in a sorted order
	 ****************************************************/
	public CardDeck(){
	
		this.deck = new ArrayList<Card>();
		
		//for each 52 possible cards in the deck...
		for (int i = 0; i < CardVal.values().length; i++){
			
			//Create a new local enum type CardVal
			//from array CardVal.values() 
			CardVal val = CardVal.values()[i];
			
			//For each suit type, below for loop
			//adds Card object to this deck with 
			//val == i and suit == j
			for (int j = 0; j < Suit.values().length; j++){
				Card card = new Card(val, Suit.values()[j]);
				this.deck.add(card);
			}
		}
	}
	
	/*****************************************************
	 * shuffle() 
	 * This function creates a random new permutation of
	 * the existing card objects in the current objects
	 * deck ArrayList
	 * 
	 * This function takes no input and returns void
	 *****************************************************/

	public void shuffle(){
		int n = this.deck.size();
		Random random = new Random();
		random.nextInt();
		for (int i = 0; i < n; i++){
			int change = i + random.nextInt(n - i);
			Collections.swap(this.deck, i, change);
		}	
	}
	
	/*****************************************************
	 * dealOneCard() 
	 * This function makes a call to shuffle() on the deck object
	 * and returns a card from the top of the newly shuffled deck
	 * If the deck is empty, NULL is returned 
	 * 
	 * This function takes no input and returns a Card object
	 *****************************************************/
	
	public Card dealOneCard(){
		//if deck is empty, return null
		if (deck.size() == 0){
			return null;
		}else{
			//else, shuffle is called 
			//and the element at index 0 after 
			//shuffle is returned to caller
			this.shuffle();	
			return deck.remove(0);
		}
	}
	
	/*****************************************************
	 * dump() 
	 * This function prints to System.out the contents 
	 * of the deck Array for debugging purposes.
	 * 
	 * This function takes no input and returns void
	 *****************************************************/
	
	public void dump(){
			System.out.println(Arrays.toString(deck.toArray()));
	}
}
