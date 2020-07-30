package javaprograms;

public class DotProduct {
	
	public static int dotProduct(int arr[], int arr1[])
	{
		int res =0;
		if( arr == null || arr1 == null ) {
		      throw new IllegalArgumentException( "Null array . Invalid input" );
		    }
		if(arr.length != arr1.length)
			return res;
		else 
		{
			for(int i=0;i<arr.length;i++)
			{
				res = res + arr[i]*arr1[i];
			}
				
		}
		
        return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] array1 = { 1, 2 };
    int[] array2 = { 2, 3 };
    int result = dotProduct( array1, array2 );

    if( result == 8 ) {
      System.out.println( "Passed." );
     
    } else {
      System.out.println( "Failed." );
      
    }


  }

}
