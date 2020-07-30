package coderpad_1;

public class DistanceBetweenTwoWords {

	public static double shortestDistance(String document, String word1, String word2) {
	    double shortest = document.length();
	    
	    //taking each word in an array 
	    String [] text = document.split("[., ]");
	    
	    int index =0;
	    int diff_location =document.length();
	    int current_diff = 0 ; //tracker
	    int word2_loc = 0;
	    int word1_loc =0;
	    
	    
	    
	    for(String word : text)
	    {
	      if(word.equalsIgnoreCase(word1))
	      {
	        word1_loc = index + word1.length()/2;
	      
	      }
	    
	      if(word.equalsIgnoreCase(word2))
	      {
	         word2_loc = index + word2.length()/2;
	    
	      }
	    
	      if(word1_loc!=0 && word2_loc!=0)
	      {
	         current_diff = Math.abs(word1_loc-word2_loc);
	         if(current_diff<diff_location)
	             diff_location = current_diff;
	      }
	    
	    index += word.length()+1;
	    }

	    return diff_location;
	  }

	  public static boolean pass() {
	    return  shortestDistance(document, "and", "graphic") == 6d &&
	        shortestDistance(document, "transfer", "it") == 14d &&
	        shortestDistance(document, "Design", "filler" ) == 25d ;
	  }

	  public static void main(String[] args) {
	    if (pass()) {
	      System.out.println("Pass");
	    } else {
	      System.out.println("Some Fail");
	    }
	  }

	  private static final String document;
	  static{
	    StringBuffer sb = new StringBuffer();
	    sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
	    sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
	    sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

	    document = sb.toString();
	  }
}
