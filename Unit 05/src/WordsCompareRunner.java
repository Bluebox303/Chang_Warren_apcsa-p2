//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   	WordsCompare asdf = new WordsCompare();
	   	asdf.setWords("abe","ape");
	   	asdf.compare();
	   	System.out.println(asdf.toString());
	   	asdf.setWords("ape","abe");
	   	asdf.compare();
	   	System.out.println(asdf.toString());
	   	
	   	
	}
}