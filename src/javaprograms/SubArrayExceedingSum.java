package javaprograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SubArrayExceedingSum {
	
	
	
		public static void print(int[] arr, int i, int j)
		{
			System.out.println(IntStream.range(i, j + 1)
										.mapToObj(k -> arr[k])
										.collect(Collectors.toList()));
		}

		// Function to find sub-arrays with given sum in an array
		public static int findSubarrays(int[] arr, int sum)
		{
			int count = 0;
			for (int i = 0; i < arr.length; i++)
			{
				int sum_so_far = 0;

				// consider all sub-arrays starting from i and ending at j
				for (int j = i; j < arr.length; j++)
				{
					// sum of elements so far
					sum_so_far += arr[j];

					// if sum so far is equal to the given sum
					if (sum_so_far > sum) {
						count ++;
						//print(arr, i, j);
					}
				}
			}
			
			return count-1;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4};
		//findSubarrays(arr,6); 
		System.out.println(findSubarrays(arr,12));

	}

}
