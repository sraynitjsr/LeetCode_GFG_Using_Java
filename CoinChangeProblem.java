import java.util.*;
public class CoinChange {
	static long count(int coins[], int n, int sum) {
	    int table[] = new int[sum + 1];
      table[0] = 1;
	    for (int i = 0; i < n; i++) {
            for (int j = coins[i]; j <= sum; j++) {
                table[j] += table[j - coins[i]];
            }
        }
	    return table[sum];
    }
	public static void start() {
    System.out.println("Inside Coin Change Using DP Problem");
		int coins[] = { 1, 2, 3 };
		int sum = 4;
		System.out.println("Sum = " + count(coins, coins.length, sum));
	}
}
