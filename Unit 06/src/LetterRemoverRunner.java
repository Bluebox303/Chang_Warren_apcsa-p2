//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover test = new LetterRemover("I am Sam I am", 'a');
		out.println(test);
		
		test.setRemover("ssssssssssssssssssssss",'s');
		out.print(test);
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		out.println(test);
		
		test.setRemover("ababababababab", 'b');
		out.println(test);
		
		test.setRemover("ababababababab", 'x');
		out.print(test);
											
	}
}