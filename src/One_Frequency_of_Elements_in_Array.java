import java.util.*;

class One_Frequency_of_Elements_in_Array {
	static void countFreq(int arr[], int n)
	{
		Map<Integer, Integer> mp = new HashMap<>();
	
		for (int i = 0; i < n; i++)
		{
			mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
		}

		for (int i = 0; i < n; i++)
		{
			if (mp.get(arr[i]) != -1)
			{
				System.out.println(arr[i] + " " + mp.get(arr[i]));
				mp.put(arr[i], -1);
			}
		}
	}

	public static void start()
	{
		System.out.println("\nInside First Module");
		int arr[] = {10, 20, 40, 10, 50, 20, 30, 50, 20, 30};
		int n = arr.length;
		countFreq(arr, n);
	}
}

