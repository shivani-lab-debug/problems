package coderpad_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Dictionarys {
	
	
	public static ArrayList<String> find_word(String [] dict,String word)
	{
		Map<String,String> map = new HashMap<String,String>();
	    StringBuilder sb = new StringBuilder();
	    ArrayList<String> list = new ArrayList<String>();
		
		for(String s : dict)
		{
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			for(char c:ch)
				sb.append(c);
			String val = sb.toString();
			list.add(val);
			map.put(s,val);
		}
		
		Collections.sort(list, Collections.reverseOrder()); 
		
		char [] p = word.toCharArray();
		String val = null;
		
		for(char c: p)
		{
			for(String l : list)
			{
				if(l.indexOf(c) == -1)
			      break;
				val = l;
			}
		}
		
		ArrayList<String> ret = new ArrayList<String>();
		
		for(Map.Entry<String,String>  entry : map.entrySet())
		{
			if(entry.getValue().equalsIgnoreCase(val))
			    ret.add(entry.getKey());
			
		}
		
		
		return ret;
		
		
	}
	
	public static void main(String[] args)
	{
		
		
		//Dictionary dict = new Dictionary(new String[]{"to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana"});
		
		String [] dict = new String[]{"to", "toe", "toes"};
		ArrayList<String> li = new ArrayList<String>();
		
		li = find_word(dict,"odg");
		
		if(li.contains("dog")&&li.contains("god")&&li.contains("dogs"));
		   System.out.println("passed");
		
		
		
	}

}
