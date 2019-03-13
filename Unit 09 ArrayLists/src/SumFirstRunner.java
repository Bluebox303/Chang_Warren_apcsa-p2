import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{				
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();
		for (int i: new int[] {-99,1,2,3,4,5,6,7,8,9,10,5}) 
		{
			ray.add(i);
		}
		
		System.out.println(ListSumFirst.go(ray));
		
		ray.clear();
	}
}