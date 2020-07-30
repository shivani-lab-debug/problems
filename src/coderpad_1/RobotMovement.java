package coderpad_1;

import java.util.Arrays;

public class RobotMovement {

	 public static Integer[] walk( String path ) {
		    
	      //Initializing origin
	      Integer[] cord = new Integer[]{0,0};
	      
	      char[] direction = path.toCharArray();
	    
	      for(char c: direction)
	      
	      {
	         if(c == 'U' || c == 'u')
	         cord[1]++;
	        else if(c == 'D' || c == 'd')
	         cord[1]--;
	        else if(c == 'L'|| c == 'l')
	         cord[0]--;
	        else if(c == 'R'|| c == 'r')
	         cord[0]++;
	        
	      }
	    
	    return cord;
	  }

	  public static boolean isEqual(Integer[] a, Integer[] b) {
	  return Arrays.equals(a, b);
	  }

	  public static boolean pass() {
	  boolean res = true;

	  {
	    String test = "UUU";
	    Integer[] result = walk(test);
	    res &= isEqual(result, new Integer[]{0, 3});
	  }

	  {
	    String test = "ULDR";
	    Integer[] result = walk(test);
	    res &= isEqual(result, new Integer[]{0, 0});
	  }

	  {
	    String test = "ULLLDUDUURLRLR";
	    Integer[] result = walk(test);
	    res &= isEqual(result, new Integer[]{-2, 2});
	  }

	  {
	    String test = "UP LEFT 2xDOWN DOWN RIGHT RIGHT UP UP";
	    Integer[] result = walk(test);
	    res &= isEqual(result, new Integer[]{1, 1});
	  }

	  return res;
	  }

	  public static void main(String[] args) {
	  if(pass()){
	    System.out.println("{Pass");
	  } else {
	    System.out.println("Test failures");
	  }
	  }

	

}
