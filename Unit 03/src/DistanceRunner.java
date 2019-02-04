//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Distance ref = new Distance();
		
		//add test cases
		ref.setCoordinates(0, 0, 0, 0);
		ref.calcDistance();
		ref.getDistance();
		ref.print();
		ref.toString();

		
	}
}