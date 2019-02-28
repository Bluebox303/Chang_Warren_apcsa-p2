//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd = 0;
		int oddplace = 0;
		int even = 0;
		int evenplace = 0;

		for (int i = 0; i <ray.length; i++)
		{
			if (ray[i]%2==1)
			{
				odd = ray[i];
				oddplace = i;
				break;
			}
			oddplace = -1;
		}
		
		for (int i = oddplace +1;i<ray.length; i++)
		{
			if (ray[i] %2 == 0)
			{
				even = ray[i];
				evenplace = i;
				break;
			}
			evenplace = -1;
		}
		
		if (evenplace >oddplace)
		{
			return evenplace - oddplace;
		}
		else if (oddplace > evenplace)
		{
			return -1;
		}
		return -1;
	}
}