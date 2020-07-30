package coderpad_1;

public class SmallestNumber {
	
	
	  public static int FindMin(int a[])
	  {
	    /*
	    ** Your code goes here
	    *
	    */
	   
	  int low =0;
	  int up = a.length-1;
	  int mid = (low +up)/2;
	    
	   if(a.length ==1)
	     return a[0];
	    
	    if(a[0]<a[a.length-1])
	      return -1;
	  
	  while(low<up)
	   {
	   mid = (low+up)/2;
	    
	    if(mid<up && a[mid]>a[mid+1])
	       return a[mid+1];
	    else if(mid<up && a[mid]>a[mid-1])
	    {    if(a[mid]>a[a.length-1])
	        {
	            low = mid+1;
	        }
	        else if(a[mid]<a[a.length-1])
	             up = mid-1;
	    }
	    else if(a[mid]<a[mid-1])
	    {
	        return a[mid];
	    }
	    else 
	    {
	      //low = up;
	    }
	 
	  }
	    
	   System.out.println(a[mid]);
	    return a[mid];
	  }

	  public static void main(String args[])
	  {
	    boolean result = true;
	   // result = result && FindMin(new int[]{3,4,5,6,1,2}) == 1;
	    result = result && FindMin(new int[]{2,1}) == 1;
	    result = result && FindMin(new int[]{1}) == 1;

	    try {
	      FindMin(null);
	      result = false;
	    }
	    catch(Exception e)
	    {
	      result = result && true;
	    }

	    if(result)
	    {
	      System.out.println("All tests pass");
	    }
	    else
	    {
	      System.out.println("There are test failures");
	    }
	  }
}
