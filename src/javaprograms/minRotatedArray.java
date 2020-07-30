package javaprograms;

public class minRotatedArray {
	
	
	public static int findMinimum(int arr[])
	{
		int len = arr.length;
		int start = 0;
		int end = len-1;
		int mid = 0;
		
		if(start == end )
			return arr[start];
		if(arr[start]<arr[end])
		    return -1;
		
		while(start<end)
		{
			mid = (start +end)/2;
			
			if(mid<end && arr[mid]>arr[mid+1])
				return arr[mid+1];
			
			if(arr[mid]>arr[mid-1])
			{
				if(arr[mid]>arr[len-1])
					start = mid+1;
				else if(arr[mid]<arr[len-1])
				    end = mid-1;
				
			}
			else
			{
				start= end;
			}
	    }
		
		
		return arr[mid];
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,4,5,6,7,2,1};
		int val = findMinimum(arr);
		
		System.out.println( "hekllo"+val);
		
		int arr1[] = {1,2};
		int va11 = findMinimum(arr1);
		
		System.out.println( "hekllo"+va11);
		
		
		
	}

}
