package coderpadstring;

public class Factorial {

	public static int  fac(int n)
	{
		//checking for the edge cases 
		if(n<0)
			return -1;
		if(n==0)
			return 1;
		int fact =1 ;
		while(n>=1)
		{
		   fact = fact*n;
		   n--;
		}
		
		return fact ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("x is :"+ fac(5));

	}

}
