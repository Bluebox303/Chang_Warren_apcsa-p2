import java.util.ArrayList;
import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{					
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		for (int i: new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}) {
			ray.add(i);
		}
		System.out.println(ListDown.go(ray));

	}
}