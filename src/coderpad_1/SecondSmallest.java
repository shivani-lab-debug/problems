package coderpad_1;

public class SecondSmallest {
	
	 public static int secondSmallest(int[] x) {
		    // Your code
		    int first_smallest = Integer.MAX_VALUE;
		    int second_smallest = Integer.MAX_VALUE;
		    
		    if(x.length == 1)
		      return 0;
		    
		    
		    for(int i =0;i<x.length;i++)
		    {
		      if(x[i]<first_smallest)
		      {
		        second_smallest = first_smallest;
		        first_smallest = x[i];
		      }
		      if(x[i]<second_smallest && x[i] != first_smallest)
		        second_smallest = x[i];
		      
		    }
		    
		    System.out.println(second_smallest);
		    return (second_smallest);
		  }

		  public static void main(String args[]) {

		    int[] a = { 0 };
		    int[] b = { 0, 1,-1,-2 };

		    boolean result = true;
		    result &= secondSmallest(a) == 0;
		    result &= secondSmallest(b) == -2;

		    if (result) {
		      System.out.println("Pass");
		    } else {
		      System.out.println("Fail");
		    }

		  }

}
