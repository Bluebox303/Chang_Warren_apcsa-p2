import java.util.ArrayList;
import java.util.Arrays;


//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		for (int i: new int[] {7,1,5,3,11,5,6,7,8,9,10,12345,11}) 
		{
			ray.add(i);
		}
		System.out.println(ListOddToEven.go(ray));

	}
}