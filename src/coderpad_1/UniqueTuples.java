package coderpad_1;

import java.util.HashSet;

public class UniqueTuples {

	
		
		public static HashSet<String> uniqueTuples( String input, int len ) {
		    // your code
		    HashSet<String> result = new HashSet<String>();
		    
		     if(input == null)
		       throw new IllegalArgumentException("input is null");
		     if(input.length() == 0)
		       throw new IllegalArgumentException("There is no characters in the string");
		     if(len<=0)
		       throw new IllegalArgumentException("Tuple length should be greater than zero");
		     if(len> input.length())
		       throw new IllegalArgumentException("Tuple length should be greater than zero");
		       
		    //no times required to traverse string to make tuple of length len 
		    for(int i =0;i<(input.length()-len+1);i++)
		    {
		      //extracting teh substring   
		      result.add(input.substring(i,(i+len)));
		   
		     }
		   
		return result;
		  }

		  public static void main( String[] args ) {
		    String input = "aab";
		    HashSet<String> result = uniqueTuples( input, 2 );
		    if( result.contains( "aa" ) && result.contains( "ab" ) ) {
		      System.out.println( "Test passed." );
		     
		    } else {
		      System.out.println( "Test failed." );
		      
		    }
		  }

	}


