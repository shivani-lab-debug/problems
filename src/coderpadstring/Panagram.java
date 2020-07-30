package coderpadstring;

public class Panagram {
    
	
	private static final String  ALPHABETS = "abcdefghijklmnopqrstuvwxyz";
	static String pangramfinder(String text) {
		StringBuilder missing = new StringBuilder("");
		char [] alphaset = ALPHABETS.toCharArray();
		int text_length = text.length();
		for(int loop =0;loop<alphaset.length;loop++)
			{
				char c = alphaset[loop];
				if(text.indexOf(c)==-1)
                     missing.append(c);
			}
			
		return missing.toString();
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String missing_characters = pangramfinder("Hi all I am shivani");
		System.out.println(missing_characters);

	}

}
