//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> result = new ArrayList<Integer>();
    	for (int[] j:m) 
    	{
    		int t = 0;
    		for (int i:j) 
    		{
    			t += i;
    		}
    		result.add(t);
    	}
    	return result;
    }
}
