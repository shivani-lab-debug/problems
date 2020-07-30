package Practise;

public class Anagram_1 {
	
	public static boolean isAnagram(String s1, String s2)
	  {
	    
	    //replacing all whitespaces and converting string into lowercase
	    s1.replaceAll("//s","").toLowerCase();
	    s2.replaceAll("//s","").toLowerCase();
	    
	    //if number of characters in two string are equal 
	    if(s1.length() != s2.length())
	    	return false;
	    
	    char[] characters = s1.toCharArray();
	    
	    for(char c: characters)
	    {
	      
	      int index = s2.indexOf(c);
	      if(index == -1)
	        return false;
	      else
	        s2 = s2.substring(0,index)+s2.substring(index+1,s2.length());
	    }
	    
	    return true;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(isAnagram("mary","army"))
		      System.out.println("test passed");
		    else
		      System.out.println("test failed");
	}

}
