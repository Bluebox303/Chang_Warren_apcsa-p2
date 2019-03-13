//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddctr = 0;
		int evenctr = 0;
		boolean oddfound = false;

		for (int i = 0; i < ray.size(); i++) 
		{
			if (ray.get(i)%2 == 1&&!oddfound) 
			{
				oddctr = i;
				oddfound = true;
			}
			else if (ray.get(i)%2 == 0 && oddfound) 
			{
				evenctr = i;
			}
		}
		if (!oddfound || 0 == evenctr) 
		{
			return -1;
		}
		else {
			return evenctr-oddctr;
		}
	}
}