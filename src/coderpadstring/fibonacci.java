package coderpadstring;

public class fibonacci {
	
	
	public static int fibonacci(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if (n==2)
			return 1;
		
		int a=1 ;
		int b=1;
		int c=0;
		
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;

		}
		
		return c;
		
	}
	
	public static void main(String args[])
	{
		System.out.println(fibonacci(5));
	}

}

