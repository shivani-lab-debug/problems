package coderpad_1;

public class PascalTriangle {
	/*This method is based on method 1. We know that ith entry in a line number line is Binomial Coefficient C(line, i) and all lines start with value 1. The idea is to calculate C(line, i) using C(line, i-1). It can be calculated in O(1) time using the following.

	C(line, i)   = line! / ( (line-i)! * i! )
	C(line, i-1) = line! / ( (line - i + 1)! * (i-1)! )
	We can derive following expression from above two expressions.
	C(line, i) = C(line, i-1) * (line - i + 1) / i

	So C(line, i) can be calculated from C(line, i-1) in O(1) time*/
	public static  int pascal(int col, int row){
	    
	    if(col==row||col==0)
	      return 1;
	    
	    int lines = row+1;
	    int  cols = col+1;
	    int entry =0;
	     
	    for(int line = 1; line <=lines;line++)
	    { 
	      int C = 1;
	      for(int j=1;j<=line;j++)
	      {
	        if(line==lines &&j==cols)
	          return C;
	        C = C*(line-j)/j;
	      }
	      entry = C;;
	    }
	  
	    
	    return entry;
	  }

	  public static void main(String[] args) {
	    if( PascalTriangle.pascal(0,0) ==  1 &&
	         PascalTriangle.pascal(1,2) ==  2 &&
	         PascalTriangle.pascal(5,6) ==  6 &&
	         PascalTriangle.pascal(4,8) ==  70 &&
	         PascalTriangle.pascal(6,6) ==  1) {
	      System.out.println("Pass");      
	    }else {
	      System.out.println("Failed");
	    }
	  }

}
