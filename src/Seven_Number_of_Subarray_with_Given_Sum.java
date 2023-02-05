import java.util.*;

class Seven_Number_of_Subarray_with_Given_Sum {

	static int findSubarraySum(int arr[], int n, int sum)
	{
		HashMap<Integer, Integer> prevSum = new HashMap<>();
		
		prevSum.put(0,1);
		
		int res = 0, currSum = 0;
		
		for (int i = 0; i < n; i++) {
			
			currSum += arr[i];
			
			int removeSum=currSum-sum;
			
			if (prevSum.containsKey(removeSum)) {
			    res += prevSum.get(removeSum);
			}
			
			prevSum.put(currSum,prevSum.getOrDefault(currSum,0)+1);
		}
		return res;
	}

	public static void start()
	{
		System.out.println("\nInside Seventh Module");
		int arr[] = { 1, 2, 3, 5, 4 };
		int sum = 5;
		int n = arr.length;
		System.out.println(findSubarraySum(arr, n, sum));
	}
}

