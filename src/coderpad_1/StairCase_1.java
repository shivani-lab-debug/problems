package coderpad_1;

import java.util.ArrayList;
import java.util.Arrays;

public class StairCase_1 {
	
	
	public static int getSteps(int n)
	{
		if(n<0)
		  return 0;
		//Taking into account that child is walking 1,2,3 steps at atime
		if(n<=2)
			return n;
		if(n==3)
			return 4;
		ArrayList<Integer> li = new ArrayList(Arrays.asList(0,1,2,4));
		for(int i=4;i<=n;i++)
		{
			li.add(li.get(i-1)+li.get(i-2)+li.get(i-3));
		}
		
		return li.get(n);
	}

	public static boolean dotestpass()
	{
		return getSteps(4)==7&&getSteps(-5)==0&&getSteps(3)==4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(dotestpass())
			System.out.println("test pass");
		else
			System.out.println("test fail");

	}

}
