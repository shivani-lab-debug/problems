package javaprograms;

import java.util.Arrays;

public class RobotMovement {
	
	
	public static Integer [] walk(String path)
	{
		Integer [] coordinates = new Integer[] {0,0};
		int path_len = path.length();
		for(char c : path.toCharArray())
		{
			if(c =='U'||c=='u')
			{
				int i =coordinates[1].intValue();
				coordinates[1]= new Integer(i+1);
			}
			
			if(c =='D'||c=='d')
			{
				int i =coordinates[1].intValue();
				coordinates[1]= new Integer(i-1);
			}
			
			if(c =='L'||c=='l')
			{
				int i =coordinates[0].intValue();
				coordinates[0]= new Integer(i-1);
			}
			
			if(c =='R'||c=='r')
			{
				int i =coordinates[0].intValue();
				coordinates[0]= new Integer(i+1);
			}
		}
			
	return coordinates;
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
		// TODO Auto-generated method stub
		if(pass()){
		    System.out.println("{Pass");
		  } else {
		    System.out.println("Test failures");
		  }
		  
		
		 System.out.println(walk("")[0].intValue());
		 System.out.println(walk("")[1].intValue());

	}

}
