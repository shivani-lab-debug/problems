package javaprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ApacheLog {
	
	public static String findTopIpaddress(String []lines)
	{
		String ip_address = null;
		String  res = null;
		int count =1;
		Map<String,Integer> ip_account = new HashMap<String,Integer>();
		
		for(String s: lines)
		{
		  ip_address = s.split("-")[0];
		  if(!(ip_account.containsKey(ip_address)))
		  {    count = 1; 
			   ip_account.put(ip_address, count);
		  }
		  else
		  {
			  count = ip_account.get(ip_address)+1;
			  ip_account.put(ip_address, count);
		  }
		 
		}
		 
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 for (Map.Entry<String,Integer> entry : ip_account.entrySet())  
		 {
			list.add(entry.getValue());
		 }
		 Collections.sort(list);
		 int ip_max_count =  list.get(list.size()-1);
		 
		 for (Map.Entry<String,Integer> entry : ip_account.entrySet())  
		 {
			if(entry.getValue()==ip_max_count)
			{
			     res = entry.getKey();
			     break;
			}
			
		 }
		
		return res.trim();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lines[] = new String[] {
		        "10.0.0.1 - log entry 1 11",
		        "10.0.0.1 - log entry 2 213",
		        "10.0.0.2 - log entry 133132" };
		    String result = findTopIpaddress(lines);
		   System.out.println(result); 
		    if (result.equals("10.0.0.1")) {
		      System.out.println("Test passed");
		      
		    } else {
		      System.out.println("Test failed");
		      
		    }  

		  }
		  

	}


