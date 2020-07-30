package javaprograms;

public class AddFraction {

	public static int lcm(int n1, int n2)
	{
		int lcm = n1>n2?n1:n2;
		while(true) {
			
			if(lcm%n1==0&&lcm%n2==0)
				break;
			else
				++lcm;
		}
		return lcm;
	}
	
	public static int[]  addFraction(int []fraction1, int []fraction2) throws Exception
	{
		if(fraction1.length >2 ||fraction2.length >2)
			throw new Exception("fraction length more than 2 not allowed");
		int lcm_of_fractions = lcm(fraction1[1],fraction2[1]);
		
		int multiplier1 = lcm_of_fractions/fraction1[1];
		int multiplier2 = lcm_of_fractions/fraction2[1];
		
		int sum_numerator = fraction1[0]*multiplier1 +fraction2[0]*multiplier2;
		int res[] = {sum_numerator,lcm_of_fractions};
		
		return res;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int lcm = lcm(3,2);
		 System.out.println("lcm is :"+lcm);
		 int[] result = addFraction( new int[]{ 2, 3 }, new int[]{ 1, 2 } );
		 System.out.println( result[ 0 ] +result[ 1 ]  );

		    if( result[ 0 ] == 7 && result[ 1 ] == 6 ) {
		      System.out.println( "Test passed." );
		  
		    } else {
		      System.out.println( "Test failed." );
		     
		    }
		

	}

}
