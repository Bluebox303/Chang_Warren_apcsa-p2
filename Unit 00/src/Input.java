//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

//import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;

		//integers
		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		
		//doubles
		System.out.print("Enter a Double :: ");
		doubleOne = keyboard.nextDouble();
		System.out.print("Enter a Double :: ");
		doubleTwo = keyboard.nextDouble();

		//floats
		System.out.print("Enter a Float :: ");
		floatOne = keyboard.nextFloat();
		System.out.print("Enter a Float :: ");
		floatTwo = keyboard.nextFloat();
		
		//shorts
		System.out.print("Enter a Short :: ");
		shortOne = keyboard.nextShort();
		System.out.print("Enter a Short :: ");
		shortTwo = keyboard.nextShort();

		//variable output
		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );
		System.out.println();
		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		System.out.println();
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		System.out.println();
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );


	}
}