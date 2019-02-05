//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int hours;
	private double mph, distance, minutes;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
		//testing for confirmation
		//out.println(distance);
		//out.println(hours);
		//out.println(minutes);
	}

	public void calcMPH()
	{
		mph = (distance)/((hours+minutes/60));
	}

	public void print()
	{
		//testing for confirmation
		//out.println(distance);
		//out.println(hours);
		//out.println(minutes);
		//out.println(mph);
		out.println(distance+" in "+hours+" hour "+" and "+minutes+" minutes = "+(int)mph+"MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		String gacheebas = distance+" in "+hours+" hour "+" and "+minutes+" minutes = "+mph+"MPH.";
		return gacheebas;	
	}
}