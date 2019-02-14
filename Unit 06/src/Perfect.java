//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   //* Need to add two constructors in order to account for parameter input
   public Perfect()
   {
	   setNumber(1);
	   isPerfect();
   }
   public Perfect(int n)
   {
	   setNumber(n);
	   isPerfect();
   }
	//add a set method
   public void setNumber(int n)
   {
	   number = n;
   }

	public boolean isPerfect()
	{
		int asdf = 0;
		for (int i=1;i< number;i++)
		{
			if (number %i ==0) 
			{
				asdf+=i;
			}
		}
		return (asdf==number);
	}

	//add a toString	
	public String toString()
	{
		if (isPerfect())
		{
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}
	
}