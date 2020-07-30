package coderpad_1;

public class AddFraction {

	public static int[] addFractions( int[] fraction1, int[] fraction2 ) {
	    // Write your code here
	    
	    if(fraction1.length ==0||fraction2.length ==0||fraction1==null||fraction2 == null)
	      throw new IllegalArgumentException("illegal fraction");
	    
	    if(fraction1.length!=2 || fraction2.length !=2)
	      throw new IllegalArgumentException("length should be greater than 2");
	    if(fraction1[1] ==0 || fraction2[1] == 0)
	      throw new IllegalArgumentException("Denominator cannot be  zero");
	    
	    int lcm = find_lcm(fraction1[1],fraction2[1]);
	    
	    int multiplier_1 = lcm/fraction1[1];
	    int multiplier_2 = lcm/fraction2[1];
	    
	    int Numerator = fraction1[0]*multiplier_1+ fraction2[0]*multiplier_2;
	    int Denominator = lcm;
	    
	    int [] result = new int []{Numerator,Denominator};
	       
	      
	    return result;
	  }
	  
	  
	  private static int find_lcm(int n1,int n2)
	  {
	    
	    int lcm = n1>n2?n1:n2;
	    
	    while(!(lcm%n1 ==0 && lcm%n2 ==0))
	      lcm++;
	    
	    return lcm;
	  }
	    
	  

	  
	  public static void main( String[] args ) {
	    int[] result = addFractions( new int[]{ 2, 3 }, new int[]{ 1, 2 } );

	    if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
	      System.out.println( "Test passed." );
	     
	    } else {
	      System.out.println( "Test failed." );
	   
	    }
	  }

	  

}
