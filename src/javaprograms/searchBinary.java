package javaprograms;

import java.util.Arrays;

public class searchBinary {
	
	public static int binarySearch(int arr[],int item)
	{
		int length = arr.length;
		int start = 0;
		int end = length-1;
		int mid = (start+end)/2;
		
		while  (start<=end)
		{
		    if(item < arr[mid])
		    {  
		    	end = mid-1;
		    }
		    else if(item> arr[mid])
		    {   
		    	start = mid+1;
		    }
		    else 
			    return mid;
		mid = (start+end)/2;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int[]{2,6,8,2,0,1,3,9};
		
		Arrays.sort(arr);
		
		for(int i :arr)
		    System.out.println("Array is " + i);
		
		int index =  binarySearch(arr,0);
		if(index==-1)
		  System.out.println("item  not found :" );
		else
			System.out.println("item found :" +arr[index]);
		
		
	}

}
