package coderpadstring;

public class longestUniformSequence {
	
	/**
	 *  
	 *  e.g.
	 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
	 */
	static int returnlongestSequenceIndex(String text)
	{
		int seqlength = 0;
		int pointer = 1;
		int string_len = text.length();
		
		
		
		while(pointer<string_len)
		{
			int curr_length = 1;
			while(pointer<string_len && text.charAt(pointer)== text.charAt(pointer-1))
		    {
			    pointer++;
			    curr_length++;
		    }
		
		    if(curr_length > seqlength)
		    {
			    seqlength = curr_length;
		    }
		    pointer++;
		}
	    
		
		return seqlength;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int len= returnlongestSequenceIndex("aabbbbdddddd");
		System.out.println(len);

	}

}
