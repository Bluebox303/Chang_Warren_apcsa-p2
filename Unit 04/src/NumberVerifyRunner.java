//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		System.out.println("11 is odd :: " + NumberVerify.isOdd(11));
		System.out.println("11 is even :: " + NumberVerify.isEven(11));
		
		System.out.println("116 is odd :: " + NumberVerify.isOdd(116));
		System.out.println("116 is even :: " + NumberVerify.isEven(116));
		
		
	}
}