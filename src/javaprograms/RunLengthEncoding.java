package javaprograms;

public class RunLengthEncoding {
	
	
	public static String getRunLength(String sent)
	{
		String text = sent.toLowerCase();
		char[] ch = text.toCharArray();
		int count = 1;
		StringBuffer sb = new StringBuffer();
		int i=0;
		
		if(i==ch.length-1)
		{
			sb.append(ch[i]).append(count);
		}
		
		while(i<(ch.length-1))
		{
			if(ch[i]==ch[i+1])
			{
				count ++;
			}
			else 
			{
				sb.append(ch[i]).append(count);
				count = 1;
			}
			++i;
			if(i==ch.length-1)
			{
				sb.append(ch[i]).append(count);
			}
			System.out.println(i);
		}
		
		return sb.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = getRunLength("a");
		System.out.println(s);

	}

}
