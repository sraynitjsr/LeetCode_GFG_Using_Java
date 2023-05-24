public class MissingNumber {
	public static void start() {
            System.out.println("Inside Finding Missing Number");
            int[] arr = { 1, 2, 3, 5 };
            int n = arr.length;
            int sum = ((n + 1) * (n + 2)) / 2;
            for (int i = 0; i < n; i++)
            sum = sum - arr[i];
            System.out.println(sum);
	}
}
