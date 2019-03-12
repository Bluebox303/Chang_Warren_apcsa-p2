/**
 * This is a class that tests the Card class.
 */
public class CardTester {
	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card one = new Card("2", "Spades", 2);
		Card two = new Card("4", "Hearts", 5);
		Card three = new Card("10", "Diamonds", 17);
		
		System.out.println("Does one match two? " + one.matches(two));
		System.out.println("Does one match three? " + one.matches(three));  
		System.out.println("Does two match three? " + two.matches(three));
		System.out.println("Suit of the first card: " + one.suit());
		System.out.println("First card: " + one.toString());
	
	}
	
}