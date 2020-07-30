package coderpad_1;

public class DotProduct {
	

	  public static int dotProduct( int[] array1, int[] array2) throws Exception {
	    
	    //checking edge cases
	    if(array1.length != array2.length)
	    {
	        throw new Exception("Arrays length are not equal");
	    }
	    
	    if(array1.length == 0|| array2.length == 0)
	    {
	        throw new Exception("pass valid array ");
	      
	    }
	    
	    //traversing both the arrays
	    
	    int i=0;
	    int j=0;
	    int res =0;
	    
	    while(i<array1.length &&j<array2.length)
	    {
	      
	        res =res + array1[i++]*array2[j++];
	      
	    }
	    
	    return res;
	  }
	 
	  public static void main( String[] args ) throws Exception {
	   int[] array1 = { 1, 2 };
	    int[] array2 = { 2, 3 };
	    int result = dotProduct(array1, array2 );

	    if( result == 8 ) {
	      System.out.println( "Passed." );
	      
	    } else {
	      System.out.println( "Failed." );
	   
	    }
	  }

  }
