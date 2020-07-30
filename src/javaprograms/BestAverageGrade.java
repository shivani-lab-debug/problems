package javaprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class BestAverageGrade {
	
	public static int bestgrade(String [][] str)
	{
		Map<String,Integer[]> map = new HashMap <String,Integer[]>();
		int res =Integer.MIN_VALUE;
		
		for(int row =0;row<str.length;row++)
		{
			
				if(map.containsKey(str[row][0]))
				{
					int count =map.get(str[row][0])[1].intValue();
					int val = map.get(str[row][0])[0] +Integer.parseInt(str[row][1]);
					map.put(str[row][0],new Integer [] {val,++count});
				}
				else
				{
					map.put(str[row][0],new Integer [] {Integer.parseInt(str[row][1]),1});
				}
			
		}
		
		for(Map.Entry<String,Integer[]> entry : map.entrySet())
		{
			System.out.println(entry.getValue()[1]);
		}
		
		
		
		for(Map.Entry<String,Integer[]> entry : map.entrySet())
		{
			int avg = entry.getValue()[0]/entry.getValue()[1];
			map.put(entry.getKey(), new Integer [] {avg,1});
		}
		
		
		
		for(Map.Entry<String,Integer[]> entry : map.entrySet())
		{
		    if(res<entry.getValue()[0])
		    	res = entry.getValue()[0];
		}
		
		
		
		
		return res;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] s1 = { { "Rohan", "84" },
	               { "Sachin", "102" },
	               { "Ishan", "55" },
	               { "Sachin", "18" } };
		System.out.println(bestgrade(s1));

	}

}
