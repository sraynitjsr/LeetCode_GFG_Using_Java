import java.util.*;

public class Twelve_Coin_Change {
	static long calculate(int coins[], int n, int sum) {
		long[] data = new long[sum + 1];
		Arrays.fill(data, 0);
		data[0] = 1;
		for (int i = 0; i < n; i++){
            for (int j = coins[i]; j <= sum; j++) {
                data[j] += data[j - coins[i]];
            }
        }
		return data[sum];
	}

	public static void start() {
		int coins[] = {2, 1, 3};
		System.out.println("Possible Ways => " + calculate(coins, coins.length, 4));
	}
}
