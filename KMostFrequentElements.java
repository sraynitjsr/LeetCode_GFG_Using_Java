import java.util.*;

public class KMostFrequentElements {
	static void display(int[] arr, int N, int K) {
		Map<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < N; i++)
		mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

		PriorityQueue<Map.Entry<Integer, Integer> > queue = new PriorityQueue<>(
				(a, b)
					-> a.getValue().equals(b.getValue())
						? Integer.compare(b.getKey(),
											a.getKey())
						: Integer.compare(b.getValue(),
											a.getValue()));
    
		for (Map.Entry<Integer, Integer> entry : mp.entrySet())queue.offer(entry);

		for (int i = 0; i < K; i++)
		System.out.print(queue.poll().getKey() + " ");
	}
  
	public static void start() {
		int arr[] = { 3, 1, 4, 4, 5, 2, 6, 1, 5, 6, 6, 1 };
		int N = arr.length;
		int K = 3;
		System.out.println(K + " numbers with most occurrences are => ");
		display(arr, N, K);
	}
}
