package coderpad_1;

public class SubArray_2 {
	
	public static int subArrayExceedsSum(int arr[], int target )
	  {
	  
	    if(target<=0)
	    {
	        return 0;
	    }
	    
	    if(arr.length==0)
	    {
	       return -1;
	    }
	    
	 
	  int count = 0; //intializing count that gives count of target subarrays 
	  int sum_so_far = 0; //intialiasing current sum  to zero , it keeps track of the sum of the subarrays formed.
	    
	    
	    for(int i=0;i<arr.length;i++)
	    {
	       sum_so_far = 0;
	       for(int j=i;j< arr.length;j++)
	       {
	            sum_so_far += arr[j];
	             if(sum_so_far>target)
	             {
	               count++;
	             }
	       }
	    }
	     System.out.println(count);
	     return count-1;
	  }

	  public static void doTestsPass()
	  {
	  boolean result = true; 
	  int[] arr = { 1, 2, 3, 4 };
	  result = result && subArrayExceedsSum( arr, 6 ) == 2;
	  result = result && subArrayExceedsSum( arr, 12 ) == -1;
	  result = result && subArrayExceedsSum( arr, 10 ) == -1;
	  result = result && subArrayExceedsSum( arr, 4 ) == 4;

	  int[] arr2 = {};
	  result = result && subArrayExceedsSum( arr2, 0 ) == 0;
	  result = result && subArrayExceedsSum( arr2, 2 ) == -1;
	  
	  if( result )
	  {
	    System.out.println("All tests pass\n");
	  }
	  else
	  {
	    System.out.println("There are test failures\n");
	  }
	  };

	  public static void main(String[] args) {
	    doTestsPass();
	  }
}
