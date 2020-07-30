package coderpad_1;

import java.util.HashSet;
import java.util.Set;

public class RunLengthEncoding {

	  public static String rle(String input) {
	    // Your code goes here
	    
	    /*
	 * Implement a run length encoding function.
	 * For a string input the function returns output encoded as follows:
	 *
	 * "a"     -> "a1"
	 * "aa"    -> "a2"
	 * "aabbb" -> "a2b3"
	 */
	 int count =0;
	 char[] ch = input.toCharArray();
	 StringBuilder sb = new StringBuilder();
	 Set<Character> set = new HashSet<Character>();

	for(char c : ch)
	{
	    set.add(c);
	  
	}
	    
	for(char s : set)
	{
	  for(int i =0;i<ch.length;i++)
	  {
	    if(s==ch[i])
	      count++;
	  }
	  
	  sb.append(s).append(count);
	  
	}
	    
	return sb.toString();

	}


	 public static void main(String[] args)  {
	    
	    if("".equals(rle("")) && 
	        "a1".equals(rle("a")) && 
	        "a3".equals(rle("aaa"))){
	      System.out.println("Passed");
	    }else {
	      System.out.println("Failed");
	    }
	  }
}
