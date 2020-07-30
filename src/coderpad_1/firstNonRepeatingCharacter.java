package coderpad_1;

public class firstNonRepeatingCharacter {
	
	
	 /**
	  * Finds the first character that does not repeat anywhere in the input string
	  * Given "apple", the answer is "a"
	  * Given "racecars", the answer is "e"
	  **/        
	  public static char findFirst(String input)
	  {
	    // code goes here
	  //checking the edge conditions
	    if(input.length() ==0 ||input == null)
	       throw new IllegalArgumentException("array is null");
	    char[] ch = input.toCharArray();
	    
	    char non_repeating_char = '0';
	    
	    
	    for(char c : ch)
	    {
	      int count = 0;
	      for(int i =0;i<ch.length;i++)
	      {
	        
	        if(c==ch[i])
	          count++;
	        if(c==ch[i] && count>1)
	           break;
	      }
	      
	      if(count == 1)
	      {
	         non_repeating_char = c;
	         break;
	      }
	    }
	    return  non_repeating_char;
	  }

	  public static void main(String args[])
	  {

	    String[] inputs = {"apple","racecars", "ababdc"};
	    char[] outputs = {'a', 'e', 'd' };

	    boolean result = true;
	    for(int i = 0; i < inputs.length; i++ )
	    {
	      result = result && findFirst(inputs[i]) == outputs[i];
	      if(!result)
	        System.out.println("Test failed for: " + inputs[i]);
	      else
	        System.out.println("Test passed for: " + inputs[i]);
	    }
	  }


}
