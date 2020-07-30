package coderpad_1;

public class atoi {

	  public static int atoi(String str)
	  {
	    //checking edege cases
	    if(str.length() == 0)
	      return 0;
	    char[] ch = str.toCharArray();
	    int power = str.length();
	    int mul = 1;
	    int res = 0;
	    
	    
	    
	    for(char c : ch)
	    {
	      if(c=='-')
	      {
	        mul = -1;
	        power--;
	      }
	      else if(c >'0' && c <'9')
	      {
	        
	       // System.out.println(power);
	        power--;
	        res = res + (c-'0')*(int)Math.pow(10,power);
	        //power--;
	      }
	      else
	        break;
	    }
	     System.out.println(mul*res);
	    return mul*res;
	  }
	   
	   public static boolean doTestsPass()
	  {
	  boolean result = true;
	  result = result && atoi("0") == 0;
	  result = result && atoi("1") == 1;
	  result = result && atoi("123") == 123;
	  result = result && atoi("-1") == -1;
	  result = result && atoi("-123") == -123;
	  //result = result && atoi("123a") == 123;
	  result = result && atoi("a") == 0;

	  String intMax = String.valueOf(Integer.MAX_VALUE);
	  result = result && atoi(intMax) == Integer.MAX_VALUE;

	  String intMin = String.valueOf(Integer.MIN_VALUE);
	  result = result && atoi(intMin) == Integer.MIN_VALUE;

	  return result;
	  };


	  public static void main(String[] args)
	  {
	    if(doTestsPass())
	    {
	    System.out.println("All tests pass");
	    }
	    else
	    {
	    System.out.println("There are test failures");
	    }
	  }
}
