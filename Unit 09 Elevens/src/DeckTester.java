/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		Deck one = new Deck(new String[] {"Queen", "King", "Ace"}, new String[] {"Black", "Red"}, 
							new int[] {12, 13, 1});
		System.out.println(one.isEmpty());
		System.out.println(one.deal());
		System.out.println(one.toString());
		
		int temp = one.size();
		for (int i = 0; i < temp; i++) {
			one.deal();
		}
		
		Deck two = new Deck(new String[] {"A", "B", "C"}, new String[] {"Giraffes", "Lions"},
							new int[] {2, 1, 6});
		System.out.println(two.isEmpty());
		System.out.println(two.deal());
		System.out.println(two.toString());
		
		
		 temp = two.size();
		for (int i = 0; i < temp; i++) {
			two.deal();
		}
		
		
		Deck three = new Deck(new String[] {"Jack", "Queen", "King"}, new String[] {"Blue", "Red"},
								new int[] {11, 12, 13});
		System.out.println(three.isEmpty());
		System.out.println(three.deal());
		System.out.println(three.toString());
	
		temp = three.size();
		for (int i = 0; i < temp; i++) {
			three.deal();
		}
	}
}
/**

	public static void main(String[] args) {
		Deck myDeck = new Deck(new String[] {"1", "3", "5"}, 
				new String[] {"spades", "hearts"}, 
				new int[] {1, 6, 7});
		System.out.println(myDeck);
		myDeck.shuffle();
		System.out.println(myDeck);
		
		Deck deckTwo = new Deck(new String[] {"Jack", "Queen", "King"},
				new String[] {"diamonds", "spades", "clubs"},
				new int[] {11, 12, 13});
		System.out.println(deckTwo);
		deckTwo.deal();
		deckTwo.deal();
		System.out.println(deckTwo);
		

		System.out.println(myDeck);
	}
}
**/