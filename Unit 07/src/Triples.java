//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum (num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 1;
		for (int i = 1; i <= a; i++)
		{
			if (a %i==0 && b %i==0 && c %i==0)
			{
				max = i;
			}
		}
		return max;
	}

	public String toString()
	{
		String output="";
		for (int one = 1; one < number; one++)
		{
			for (int two = one; two < number; two++)
			{
				for (int three = two; three <= number; three++)
				{
					if ((one + two) % 2 == 1 
							&& three % 2 == 1 
							&& Math.abs(Math.pow(one,  2) + Math.pow(two,  2) 
							- Math.pow(three, 2)) <= 0.1 
							&& greatestCommonFactor(one, two, three) == 1) {
						output += "" + one + " " + two + " " + three + "\n";
					}
				}
			}
		}
		return output+"\n";
	}
}