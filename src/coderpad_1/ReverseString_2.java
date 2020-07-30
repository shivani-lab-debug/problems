package coderpad_1;

public class ReverseString_2 {

	 public static String reverseStr( String str ){
		    //your code goes here
		    
		    char[] ch = str.toCharArray();
		    int left = 0;
		    int right = ch.length -1;
		    
		    for(;left<right;left++,right--)
		    {
		      char temp = ch[left];
		      ch[left]=ch[right];
		      ch[right]=temp;
		    }
		    
		    StringBuilder sb = new StringBuilder(ch.length);
		    for(char c: ch)
		      sb.append(c);
		    
		     return sb.toString();
		  }

		  public static void main(String[] args) {
		    
		    
		    boolean result = true;

		    result = result && reverseStr("abcd").equals("dcba");
		  
		  if(result){
		    System.out.println("All tests pass");
		  }
		  else{
		    System.out.println("There are test failures");
		  }

		   }
}
