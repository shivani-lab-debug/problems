package coderpad_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BestAverageGrade {

	 public static Integer bestAvgGrade(String[][] scores)
	  {
	     
	     //checking the edge cases 
	     if(scores.length==0 || scores[0].length ==0)
	       return 0;
	     
	     Map<String, ArrayList<Integer>>  map = new   HashMap<String, ArrayList<Integer>>();
	     
	     int loop =0;
	     
	     
	     while(loop< scores.length)
	     {
	       
	       int val = Integer.parseInt(scores[loop][1]);
	       String name =  scores[loop][0];
	       
	       if(!map.containsKey(scores[loop][0]))
	       {
	         ArrayList<Integer> list =  new ArrayList<Integer>();
	         list.add(val);  
	         map.put(name,list);
	       }
	       else
	       {
	         
	         ArrayList<Integer> lis = map.get(scores[loop][0]);
	         lis.add(val);
	        }
	      
	       loop++;
	     }
	     
	     
	     for(Map.Entry<String,ArrayList<Integer>>maps : map.entrySet())
	     {  
	       int size =  maps.getValue().size();
	       int total = 0;
	       if(size >1)
	       {
	         for(Integer i : maps.getValue())
	         {
	            total += i.intValue();
	         }
	        
	         System.out.println(total);
	         maps.getValue().clear();
	         maps.getValue().add(total/size);
	         
	       }
	       
	     }
	     Integer  max_value  = Integer.MIN_VALUE;
	     
	     for(Map.Entry<String,ArrayList<Integer>> maps : map.entrySet())
	     {  
	       
	       
	       if(maps.getValue().get(0) > max_value)
	         max_value = maps.getValue().get(0);
	       
	     }
	    
	    
	    return max_value;
	  }

	  public static boolean pass()
	  {
	    String[][] s1 = { { "Rohan", "84" },
	               { "Sachin", "102" },
	               { "Ishan", "88" },
	               { "Sachin", "18" } };

	    return bestAvgGrade(s1) == 88;
	  }

	  public static void main(String[] args)
	  {
	    if(pass())
	    {
	      System.out.println("Pass");
	    }
	    else
	    {
	      System.out.println("Some Fail");
	    }
	  }
}
