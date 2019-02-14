//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect one = new Perfect(496);
		System.out.println(one.toString());
		
		Perfect two = new Perfect(45);
		System.out.println(two.toString());
		
		Perfect three = new Perfect(6);
		System.out.println(three.toString());
		
		Perfect four = new Perfect(14);
		System.out.println(four.toString());
		
		four.setNumber(8128);
		System.out.println(four.toString());
		
		four.setNumber(1245);
		System.out.println(four.toString());
		
		four.setNumber(33);
		System.out.println(four.toString());
		
		four.setNumber(28);
		System.out.println(four.toString());
		
		four.setNumber(27);
		System.out.println(four.toString());
		
		four.setNumber(33550336);
		System.out.println(four.toString());										
	}
}