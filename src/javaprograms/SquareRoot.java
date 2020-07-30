package javaprograms;

public class SquareRoot {
	
	
	public static double square_root(double val) {
		
		boolean found = false;
		int i = 0;
		double root =0;
		
		while(!found)
		{
			if(i*i==val)
			{
				found = true;
				root = i;
			
			}
			if(i*i>val)
			{
				root = bin_root(val,i-1,i);
				found = true;
				
				
			}
			i++;
			
		}
		return root;
	}
		
		public static double bin_root(double val, double lb,double up)
		{
			double mid = (lb+up)/2;
			double mul = mid*mid;
			if(mul == val || (Math.abs(mul - val) < 0.00001))
				return mid;
			else if(mul > val)
				return mid = bin_root(val,lb,mid);
			else 
				return mid = bin_root(val,mid,up);
		
			
		}
		
		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("square root is "+square_root(2));

	}

}
