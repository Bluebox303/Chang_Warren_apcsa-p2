//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		//Go through all character pairs and count the possible pairs
		int count = 0;
		for (int i = 0; i <str.length() -1; i++)
			//for(initial value(start); boolean condition placed here(stop); increasing/decreasing(interval))
		{
			if (str.charAt(i) == str.charAt(i+1)) count++;
		}
		return count;
	}
}