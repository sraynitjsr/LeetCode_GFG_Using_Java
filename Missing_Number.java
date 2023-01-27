import java.util.*;

public class Main {

	public static int findMissingNumber(int[] nums, int size)
	{
		int sum = ((size + 1) * (size + 2)) / 2;
		for (int i = 0; i < size; i++)
			sum = sum - nums[i];
		return sum;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 4, 5, 6, 7, 8 };
		System.out.println(findMissingNumber(arr, arr.length));
	}
}
