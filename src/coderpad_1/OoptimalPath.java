package coderpad_1;

public class OoptimalPath {
	
	
	 public static Integer optimalPath(Integer[][] grid)
	  {

	   //checking the edge conditions
	   if(grid.length==0||grid[0].length==0)
	      return 0;
	      
	   //traversing array
	      for(int row = grid.length-1;row>=0;row--)
	      {
	         for(int col =0; col < grid[0].length;col++)
	         {
	           if(row<grid.length-1 && col>0)
	             grid[row][col]+= Math.max(grid[row+1][col],grid[row][col-1]);
	           else if(row<grid.length-1)
	             grid[row][col]+=grid[row+1][col]; //moving up
	           else if(col>0)
	             grid[row][col]+= grid[row][col-1]; //moving right
	         }
	      }
	      
	   return grid[0][grid[0].length-1];
	  }

	  
	  public static boolean doTestsPass()
	  {
	  boolean result = true;
	  result &= optimalPath(new Integer[][]{{0,0,0,0,5},
	                      {0,1,1,1,0},
	                      {2,0,0,0,0}}) == 10;    
	  return result;
	  }

	  public static void main(String[] args)
	  {
	  if(doTestsPass())
	  {
	    System.out.println("All tests pass");
	  }
	  else
	  {
	    System.out.println("Tests fail.");
	  }
	  }
	  }

	

