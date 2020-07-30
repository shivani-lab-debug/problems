package javaprograms;

public class Median {
	
	 static int [] combine_array(int arr1[], int arr2[])
	{
		final int total_length = arr1.length +arr2.length;
		int [] temp = new int[total_length];
		for(int i=0,j=0;i<total_length;i++,j++)
		{
			if(i<arr1.length)
				temp[i] = arr1[i];
			if(i==arr1.length)
			    j=0;
			if(i>=arr1.length)
				temp[i] = arr2[j];
		}
		return temp;
	}
	
	 static int [] mergesort(int[] arr,int low,int up)
	 {  
		 int mid = 0;
		 final int size = arr.length;
		 int temp[] = new int[size];
		 if(low<up)
		 {
			 mid = (low+up)/2;
			 mergesort(arr,low,mid);
		     mergesort(arr,mid+1,up);
		     merge(arr,temp,low,mid,mid+1,up);
		     copy(arr,temp,low,up);
		 }
		 return arr;
	 }
	 
	 static int[] merge(int[]arr,int[]temp, int low1,int up1,int low2,int up2)
	 {
		 int i = low1;
		 int j = low2;
		 int k = low1;
	     
		 while(i<=up1&&j<=up2)
		 {
			 if(arr[i]<=arr[j])
                 temp[k++]= arr[i++];
             else
            	 temp[k++]= arr[j++];
         }
		
		 while(i<=up1)
		 {
			 temp[k++] = arr[i++];
		 }
		 while(j<=up2)
		 {
			 temp[k++] = arr[j++];
		 }
		 
	 return temp;
	 }
	 
	static  void copy(int[]arr,int[]temp,int low,int up)
	 {
		 int i = low;
		 while(i<=up)
		 {
			 arr[i] = temp[i];
			 i++;
		 }
	 }
	 
	 static int findmedian(int arr1[],int arr2[])
	 {
		 int median = 0;
		 int index1=0;
		 int index2=0;
		 
		 int arr3 []= combine_array(arr1,arr2);
		 mergesort(arr3,0,arr3.length-1);
		 
		 for(int i :arr2)
		 { 
			 //System.out.println(i);
		 }
		
		 for(int i :arr3)
		 { 
			 System.out.println(i);
		 }
		 
		 int total_len = arr3.length;
		 if((total_len)%2==0)
		 {  
			 index1 = total_len/2;
			 index2 = index1-1;
			 median = (arr3[index1]+arr3[index2])/2;
		 }
		 else
		 {
			 index1 = total_len/2;
			 median = (arr3[index1]);
		 }
		return median;	 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i = findmedian(new int[] {1,2,5},new int[] {3,4});
         System.out.println(i);
	}

}
