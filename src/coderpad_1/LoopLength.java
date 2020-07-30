package coderpad_1;

import java.util.ArrayList;

public class LoopLength {
	
	 public static int countLengthOfCycle( int[] arr, int startIndex ) {
		  //your code goes 
		    
		  int walkindex = startIndex;
		    
		  ArrayList<Integer> indexes = new ArrayList<Integer> ();
		    
		  int looplength = 0;
		    
		  while(!indexes.contains(walkindex))
		  {
		      indexes.add(walkindex);
		      walkindex = arr[walkindex];
		      looplength++;
		  }
		    
		  System.out.println(looplength);
		  return looplength;
		  }


		  public static void main( String[] args ) {

		 boolean testsPassed = true;
		  
		  testsPassed &= countLengthOfCycle(new int[]{1, 0}, 0) == 2;
		  testsPassed &= countLengthOfCycle(new int[]{1, 2, 0}, 1) == 3;
		  
		  if(testsPassed) {
		    System.out.println( "Test passed." );
		    //return true;
		  } else {
		    System.out.println( "Test failed." );
		    //return false;
		  }


		  }
}
