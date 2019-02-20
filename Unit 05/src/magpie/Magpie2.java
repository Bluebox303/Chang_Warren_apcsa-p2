package magpie;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() <= 0) {
			response = "Say something, por favor.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
				{
			response = "Tell me more about your pets";
				}
		else if (statement.indexOf("Mauro") >= 0 
				|| statement.indexOf("mauro") >= 0)
		{
			response = "Your teacher sounds like a pop.";
		}
		//additional keyword/response pair one
		else if (statement.indexOf("friend") >= 0
				|| statement.indexOf("people") >= 0)
		{
			response = "What a sociable individual.";
		}
		//additional keyword/response pair two
		else if (statement.indexOf("school") >= 0 
				|| statement.indexOf("grades") >= 0 
				|| statement.indexOf("student") >= 0)
		{
			response = "It doesn't seem like you're doing bad academically.";
		}
		//additional keyword/response pair three
		else if (statement.indexOf("yes") >= 0)
		{
			response = "I always appreciate enthusiasm.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "What's with the negativity?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Huh.";
		}
		else if (whichResponse == 2)
		{
			response = "Is that what you really think?";
		}
		else if (whichResponse == 3)
		{
			response = "Really now.";
		}
		else if (whichResponse == 4)
		{
			response = "That never crossed my mind.";
		}
		else if (whichResponse == 5)
		{
			response = "Ha! You actually made me laugh!";
		}

		return response;
	}
}
