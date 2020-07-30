package coderpad_1;

public class SquareRoot {
	
	
	public static double squareRoot( double x )
	  {
	    
	    //edge conditions
	    if(x<0)
	      throw new IllegalArgumentException("There is no root for negative numbers");
	    
	    int i =0;
	    boolean found = false;
	    double root=0;
	    
	    
	    while(!found)
	    {
	      if(i*i==x)
	      {
	        found = true;
	        root  = i; 
	      }
	      if(i*i>x)
	      {  root = bin_root(x,i-1,i);
	        found = true;
	      }
	     i++;
	    }
	    
	    return root;
	  }
	  
	  public static double bin_root(double x,double low,double up)
	  {
	    double mid = (low+up)/2;
	    double mul = mid ; 
	    if(mul == x || (Math.abs(mul-x)<0.001))
	        return mid;
	    else if(mul>x)
	     return mid = bin_root(x,low,mid);
	    else 
	      return mid = bin_root(x,mid,up);
	    
	    
	  }
	    
	    
	  
	  public static void main( String args[])
	  {
	    double[] inputs = {2, 4, 100};
	    double[] expected_values = { 1.41421, 2, 10 };
	    double threshold = 0.001;
	    for(int i=0; i < inputs.length; i++)
	    {
	      if( Math.abs(squareRoot(inputs[i])-expected_values[i])>threshold )
	      {
	        System.out.printf( "Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]) );
	      }
	    }
	    System.out.println( "All tests passed");
	  }

}
