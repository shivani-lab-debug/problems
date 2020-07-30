package coderpad_1;

import java.util.HashSet;
import java.util.Set;

public class PanagramDetector {
	
	private static class PanagramDetectors {
		  private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

		  public String findMissingLetters(String sentence) {
		    
		  Set<Character> set = new HashSet<Character>();
		  char[] alphabet = ALPHABET.toCharArray();
		  
		  for (char c : alphabet)
		    set.add(c);
		    
		  String s = sentence.toLowerCase();
		    
		  char [] text = s.toCharArray();
		    
		  for(char c: text)
		  {
		    set.remove(c);
		  }
		  
		  StringBuilder sb = new StringBuilder();
		  for(Character c : set)
		      sb.append(c.charValue());
		    return sb.toString();
		  }

		  }

		  public static void main(String[] args) {
		  PanagramDetectors pd = new PanagramDetectors();
		  boolean success = true;

		  success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
		  success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

		  if (success) {
		    System.out.println("Pass ");
		  } else {
		    System.out.println("Failed");
		  }
		  }

}
