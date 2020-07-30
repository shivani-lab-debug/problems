package javaprograms;

public class atoi {
	
	public static int strToInt(String text)
	{
		int len = text.length();
		int power = len-1;
		int res = 0;
		int multiplier = 1;
		
		for(char c:text.toCharArray())
		{
			
			if(c=='-')
			{
				multiplier=-1;
				power--;
				continue;
			}
			if((c<'0')||(c>'9'))
			{
				break;
			}
			
			res = (int) (res +(c-'0')*Math.pow(10, power));
			power--;
			System.out.println(res);
			
		}
		
		
		
		return res *multiplier;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strToInt("-8765"));

	}

}
