package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class LoopLength {

	public static int loopLength(int arr[],int start)
	{
		int count =0;
		int cursor = start;
		Map<Integer,Integer> element_visited = new HashMap<Integer,Integer>();
		
		while(!element_visited.containsKey(cursor))
		{
			if((arr[cursor]>arr.length)||(arr[cursor]<0)||(arr[cursor]==cursor)) return -1;
			
			element_visited.put(cursor,count);
			cursor = arr[cursor];
			count++;
		}
		
		return count-element_visited.get(cursor);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean testsPassed = true;
		System.out.println(loopLength(new int[]{1, 3, 0, 4, 1}, 0));
		  
		  testsPassed &= loopLength(new int[]{1, 0}, 0) == 2;
		  testsPassed &= loopLength(new int[]{1, 2, 0}, 0) == 3;
		  testsPassed &= loopLength(new int[]{1, 3, 0, 4, 1}, 0) == 3;
		  
		  if(testsPassed) {
		    System.out.println( "Test passed." );
		    //return true;
		  } else {
		    System.out.println( "Test failed." );
		    //return false;
		  }


		
	}

}
