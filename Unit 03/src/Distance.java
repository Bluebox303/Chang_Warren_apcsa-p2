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
	private double xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		double distance = 0; 	
				
	}

	public Distance(double x1, double y1, double x2, double y2)
	{
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}

	public void setCoordinates(double x1, double y1, double x2, double y2)
	{
		Scanner asdf = new Scanner(System.in);
		
		out.println("Enter X1 :: ");
		xOne = x1 = Double.parseDouble(asdf.next());
		out.println(x1 +" || "+xOne);
		
		out.println("Enter Y1 :: ");
		yOne = y1 = Double.parseDouble(asdf.next());
		out.println(y1 +" || "+yOne);
		
		out.println("Enter X2 :: ");
		xTwo = x2 = Double.parseDouble(asdf.next());
		out.println(x2 +" || "+xTwo);
		
		out.println("Enter Y2 :: ");
		yTwo = y2 = Double.parseDouble(asdf.next());
		out.println(y2 +" || "+yTwo);
	}

	public void calcDistance()
	{
		double num = (xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne);
		num = Math.sqrt(num);
		distance = num;
	}
	
	public double getDistance()
	{
		
		return distance;
	}
	
	public void print()
	{
		out.println("distance == "+distance);
	}
	
}