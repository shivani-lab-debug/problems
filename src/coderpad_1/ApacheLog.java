package coderpad_1;

import java.util.HashMap;
import java.util.Map;

public class ApacheLog {

	 public static String findTopIpaddress(String[] lines) {
		    // Your code goes here
		    Map <String,Integer> ip_address_list = new HashMap<String,Integer>();
		    
		    String [] ip_address = new String[lines.length];
		   
		    int i =0;
		    for(String s : lines)
		    {
		       if(i < lines.length)
		           ip_address[i] = s.split("-")[0];
		       i++;
		    }
		    
		    
		    for(String ip : ip_address)
		    {
		      if(ip_address_list.containsKey(ip))
		      { 
		        int val = ip_address_list.get(ip);
		        ip_address_list.put(ip,++val);
		      }
		      else
		        ip_address_list.put(ip,1);
		     }
		    
		    int max = -1;
		    String ip_address_ = null;
		    
		    for(Map.Entry<String,Integer> maps :ip_address_list.entrySet())
		    {
		      System.out.println(maps.getValue());
		      if(maps.getValue()> max)
		        max = maps.getValue();
		    }
		    
		    for(Map.Entry<String,Integer> maps :ip_address_list.entrySet())
		    {
		      
		      if(maps.getValue()==max)
		        ip_address_ = maps.getKey();
		    }
		    
		    System.out.println(ip_address_);
		    return ip_address_.trim();
		  }
		  
		     
		  
		  
		  public static void main(String[] args) {
		    
		String lines[] = new String[] {
		        "10.0.0.1 - log entry 1 11",
		        "10.0.0.1 - log entry 2 213",
		        "10.0.0.2 - log entry 133132" };
		    String result = findTopIpaddress(lines);
		    
		    if (result.equals("10.0.0.1")) {
		      System.out.println("Test passed");
		      
		    } else {
		      System.out.println("Test failed");
		      
		    }  

		  }

}
