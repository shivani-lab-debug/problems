package coderpad_1;

public class Median {
	
	
	
	
	public static  int combine_array(int[] a,int[] b)
	{
		final int size = a.length + b.length;
		int [] temp = new int[size];
		
		int k =0;
		int i=0;
		int j = 0;
		
		while((i<a.length) && (j<b.length))
		{
			if(a[i]<=b[j])
			    temp[k++] = a[i++];
			else 
			    temp[k++] = b[j++];
		}
		
		while(i<a.length)
			temp[k++] = a[i++];
		while(j<b.length)
			temp[k++] = b[j++];
		
		
		int median = 0;
		if(temp.length %2 ==0)
		{
			int index = temp.length/2;
			int index1 = index-1;
			median = (temp[index]+temp[index-1])/2;
		}
		else
		{
			int index = temp.length/2;
			median = temp[index];
		}
		
		return median;
		
	}
	

		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a []= {2,6,8};
		int b[] = {3,4,9};
		int d  = combine_array(a,b);
		System.out.println(d);
			
		}

	}


