package javaprograms;

public class IsPowerOf10 {

	public static boolean isPowerOf10(int n)
	{
		
		while(n>1&&n%10==0)
		{
			n= n/10;
		}
		
		if(n==1) 
			return true;
		else
		    return false;
	}
	
	public static boolean isNotPowerOf10(int n)
	{
		
		while(n>1&&n%10==0)
		{
			n= n/10;
		}
		
		if(n>1) 
			return true;
		else
		    return false;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] isPowerList = {1,10,100,10000,1000000};
		  int[] isNotPowerList = {3,-3,4,70,500};

		  for(int i : isPowerList)
		  {
		    if(!isPowerOf10(i))
		    {
		    System.out.println("Test failed for: " + i);
		   
		    }
		  }

		  for(int i : isNotPowerList)
		  {
		    if(isPowerOf10(i))
		    {
		    System.out.println("Test failed for: " + i);
		 
		    }
		  }

		  System.out.println("All tested passed");

	}

}
