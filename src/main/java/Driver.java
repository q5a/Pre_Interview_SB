
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardDeck deck = new CardDeck();
		for (int i = 0; i < 10; i++){
			deck.shuffle();
			//deck.dump();
			System.out.println(deck.dealOneCard());
		}
		System.out.println("Successful Run");
	}

}
