//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('a');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = amount; i>0; i--)
		{
			int j = 0; //rowtracker
			char temp = letter;
			while (j<i)
			{
				for (int k = amount - j; k>0; k--)
				{
					output += temp;
				}
				if (temp == 'Z'|| temp == 'z')
				{
					temp -=25;
				}
				else
				{
					temp ++;
				}
				output += " ";
				j++;
			}
			output += "\n";
		}
		return output;
	}
}