package coderpad_1;

public class OptimalPath_3 {
	
	static int calculate_distance(int [][] mat)
	{
		if (mat.length==0||mat[0].length==0)
		  return 0;
		for(int row = mat.length-1;row>=0;row--)
		{
			for(int col = 0;col<mat[0].length;col++)
			{
				
				if(row<mat.length-1&&col>0)
				{
					mat[row][col] = mat[row][col]+Math.max(mat[row+1][col], mat[row][col-1]);
				}
				else if(row < mat.length-1)
					mat[row][col]= mat[row][col]+mat[row+1][col];
				else if(col > 0)
					mat[row][col]= mat[row][col]+mat[row][col-1];
				System.out.println("row:"+row);
				System.out.println("col:"+col);
				System.out.println(mat[row][col]);
			}
			
		}
		return mat[0][mat[0].length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] mat = {{0,0,0,0,5},
				        {0,1,1,1,0},
				        {2,0,0,0,0}};
		System.out.println(calculate_distance(mat));
		}

	}


