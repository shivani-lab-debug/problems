package javaprograms;

public class firstNonRepeating {
	
	public static char getNonRepChar(String word)
	{
		String lower_char = word.toLowerCase();
		
		char[] ch = lower_char.toCharArray();
		
		boolean found = false;
		
		int i =0;
		int flag = 0;
		
		while(!found && i<ch.length)
		{
			
			for(int j=i+1;j<ch.length;j++)
			{
				//setting each repeating character to zero
				if(ch[i] == ch[j]&&ch[i]!='0')
				{	flag = 1;
				    ch[j] = '0';
				}
		   }
		   if(flag==0 &&ch[i]!='0')
			{
				found=true;
				return ch[i];
		    }
			ch[i]='0';
			flag=0;
			i++;
		}
		
		return '0';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getNonRepChar("Wwiissddoom"));

	}

}
