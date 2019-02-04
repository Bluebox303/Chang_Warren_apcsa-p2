//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		//instantiation of variable distance
		double distance = 0; 	
				
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		//instantiation of variables
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		Scanner asdf = new Scanner(System.in);
		
		out.println("Enter X1 :: ");
		x1 = Integer.parseInt(asdf.next());
		
		out.println("Enter X2 :: ");
		x2 = Integer.parseInt(asdf.next());
		
		out.println("Enter Y1 :: ");
		y1 = Integer.parseInt(asdf.next());
		
		out.println("Enter Y2 :: ");
		y2 = Integer.parseInt(asdf.next());
	}

	public void calcDistance()
	{
		distance = sqrt((xTwo-xOne)^2+(yTwo-yOne)^2);
	}
	
	public double getDistance()
	{
		
		return distance;
	}
	
	public void print()
	{
		out.println(distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
		//out.println("distance == "+distance);
	}
}