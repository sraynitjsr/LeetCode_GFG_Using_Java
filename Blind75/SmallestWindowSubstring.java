import java.util.HashMap;
import java.util.Map;

public class SmallestWindowSubstring {
    public static String smallestWindow(String s, String pattern) {
        if (s == null || pattern == null || s.length() == 0 || pattern.length() == 0 || s.length() < pattern.length()) {
            return "";
        }

        Map<Character, Integer> patternMap = new HashMap<>();
        for (char ch : pattern.toCharArray()) {
            patternMap.put(ch, patternMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = 0;
        int required = patternMap.size();
        int formed = 0;
        int[] windowCounts = new int[256];
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0, minRight = 0;

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowCounts[currentChar]++;

            if (patternMap.containsKey(currentChar) && windowCounts[currentChar] == patternMap.get(currentChar)) {
                formed++;
            }

            while (left <= right && formed == required) {
                int windowLength = right - left + 1;
                if (windowLength < minLength) {
                    minLength = windowLength;
                    minLeft = left;
                    minRight = right;
                }

                char leftChar = s.charAt(left);
                windowCounts[leftChar]--;

                if (patternMap.containsKey(leftChar) && windowCounts[leftChar] < patternMap.get(leftChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        if (minLength == Integer.MAX_VALUE) {
            return "";
        } else {
            return s.substring(minLeft, minRight + 1);
        }
    }

    public static void smallestWindowSubstring() {
        String s = "ADOBECODEBANC";
        String pattern = "ABC";
        String smallestWindow = smallestWindow(s, pattern);
        System.out.println(smallestWindow);
    }
}
