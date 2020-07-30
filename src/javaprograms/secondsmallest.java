package javaprograms;

public class secondsmallest {
	
	
	

	public static int findSecondSmallest(int arr[])
	{
		int fst_min = Integer.MAX_VALUE;
		int sec_min = Integer.MAX_VALUE;
		
		int len = arr.length;
		
		for (int i=0;i<len;i++)
		{
			if(arr[i]<fst_min)
			{
				sec_min = fst_min;
				fst_min = arr[i];
			}
			else if(arr[i]<sec_min && arr[i]!=fst_min)
				sec_min = arr[i];
			
			
		}
		
		
		return sec_min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,7,1,2,9,4};
		System.out.println("value:"+findSecondSmallest(arr));
		

	}

}
