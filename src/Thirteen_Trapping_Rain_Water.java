import java.io.*;
import java.util.*;

class Trapping_Rain_Water_Problem {

	public static int maxWater(int[] height)
	{
		Stack<Integer> stack = new Stack<>();

		int n = height.length;

		int ans = 0;

		for (int i = 0; i < n; i++) {

			while ((!stack.isEmpty()) && (height[stack.peek()] < height[i])) {

				int pop_height = height[stack.peek()];
				stack.pop();

				if (stack.isEmpty())
				break;

				int distance = i - stack.peek() - 1;

				int min_height = Math.min(height[stack.peek()],height[i]) - pop_height;

				ans += distance * min_height;
			}
			stack.push(i);
		}

		return ans;
	}
	
	public static void start() {
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.print(maxWater(arr));
	}
}

