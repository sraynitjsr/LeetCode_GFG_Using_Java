import java.util.*;

public class MaxRodLength {
    
    public static boolean isValidLength(int[] people, int Q, int length) {
        int count = 0;
        for (int person : people) {
            count += person / length;
        }
        return count >= Q;
    }
    
    public static int maxRodLength(int[] people, int Q) {
        int maxLen = Arrays.stream(people).max().getAsInt();
        int left = 1, right = maxLen, result = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (isValidLength(people, Q, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return result;
    }
    
    public static void start() {
        int[] people = {5, 8, 9, 12};
        int Q = 5;
        int maxLength = maxRodLength(people, Q);
        System.out.println("Maximum length of rod for Q-th person: " + maxLength);
    }
}
