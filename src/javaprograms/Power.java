package javaprograms;

public class Power {
	
	public static double power(double base,int exp)
	{
		double res =1;
		
		
		for(int i=0;i<exp;i++)
		{
			res = res*base;
		}
		
		
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(power(2,3));
	}

}
