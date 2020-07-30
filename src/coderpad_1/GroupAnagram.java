package coderpad_1;

public class GroupAnagram {
	
	 static String input = "cat dog tac sat tas god dog";
	  
	  static void setOfAnagrams(String inputString){ 
	    
	    //your code goes here
	    String [] words = inputString.split(" ");
	    
	    for(int i =0;i<words.length;i++)
	    {
	      for(int j=i+1;j<words.length;j++)
	      {    if(isAnagram(words[i],words[j]))
	           {
	              String temp = words[i+1];
	              words[i+1] = words[j];
	              words[j] = temp;
	           }
	      }
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    for(String s : words)
	      sb.append(s).append(" ");
	  System.out.println(sb.toString());
	  }
	  
	  static boolean isAnagram(String s1,String s2)
	  {
	    if(s1.length() != s2.length())
	       return false;
	    else{
	      char [] ch = s1.toCharArray();
	      for(char c : ch)
	      {
	        if(s2.indexOf(c) == -1)
	          return false;
	    
	      }
	      return true;
	    }
	  }
	  
	  public static void main(String[] args) {
		    
		    String input = "cat dog tac sat tas god dog";
		    setOfAnagrams(input);
		    
		  }

}
