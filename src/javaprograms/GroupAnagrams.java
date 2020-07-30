package javaprograms;

public class GroupAnagrams {
	
	
	public static boolean isAnagram(String str1, String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		else
		{
			for(int i=0;i<str1.length();i++)
			{
				if(str2.indexOf(str1.charAt(i))==-1)
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static String group_anagram(String s)
	{
		int len = s.length();
		String[] word = s.split(" ");
		String temp = null;
		String st = "";
		for(int i = 0;i<word.length;i++)
		{
			for(int j = i+1;j<word.length;j++)
			{
				if(isAnagram(word[i],word[j]))
				{
					temp = word[i+1];
					word[i+1] = word[j];
					word[j] = temp;
				}
			}
		}
		
		for(String w:word)
			st = st +" " + w ;
		
		return st;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean res = isAnagram("mary","armu");
		System.out.println(res);
		String g = group_anagram("cat dog tac sat tas god dog");
		System.out.println(g);
		

	}

}
