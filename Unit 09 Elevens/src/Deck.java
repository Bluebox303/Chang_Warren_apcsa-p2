import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	private List<Card> cards = new ArrayList<Card>();
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		
		for (int i=0; i<suits.length; i++)
		{
			for (int x =0; x<ranks.length; x++)
			{
				cards.add(new Card(ranks[x], suits[i], values[x]));
			}
		}
		
		size = cards.size();
		
	}
	public boolean isEmpty() {
		return (size == 0);
	}


	public int size() {
		return size;
	}

	public void shuffle() {
		for (int i=cards.size()-1; i >= 1; i--)
		{
			int r = (int)(Math.random() * (i+1));
			Card save = cards.get(i);
			cards.set(i,  cards.get(r));
			cards.set(r,  save);
		}
	}

	public Card deal() {
		if (cards.size() <= 0)
			return null;
		size -= 1;
		return cards.get(size);
	}

	@Override
	public String toString() {
		String result = "size = " + size + "\nUndealt cards: \n";
		result = result + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k>=size; k--)
		{
			result = result + cards.get(k);
			if (k != size)
				result = result + ", ";
			if ((k-size) %2 == 0)
				result =result + "\n";
		}
		
		result = result + "\n";
		return result;
	}
}