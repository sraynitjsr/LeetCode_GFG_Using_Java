import java.io.*;
import java.util.*;

class MyPairSum {
	static void display(int arr[], int sum)
	{
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];
			if (s.contains(temp)) {
				System.out.println("Yes");
				return;
			}
			s.add(arr[i]);
		}
		System.out.println("No");
	}

	public static void main(String[] args)
	{
		int A[] = { 1, 4, 5, 2, 3 };
		display(A, 5);
		display(A, 10);
	}
}

