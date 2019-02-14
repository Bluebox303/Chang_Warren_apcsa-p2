//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		TriangleOne test = new TriangleOne("hippo");
		test.print();
		
		test = new TriangleOne("abcd");
		test.print();
		
		test = new TriangleOne("it");
		test.print();
		
		test = new TriangleOne("chicken");
		test.print();
	}
}