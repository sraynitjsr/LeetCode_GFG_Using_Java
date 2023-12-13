import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordConcatenation {

    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= s.length() - totalLength; i++) {
            Map<String, Integer> seenWords = new HashMap<>();
            int j = 0;

            while (j < words.length) {
                int start = i + j * wordLength;
                int end = start + wordLength;
                String currentWord = s.substring(start, end);

                if (wordCount.containsKey(currentWord)) {
                    seenWords.put(currentWord, seenWords.getOrDefault(currentWord, 0) + 1);

                    if (seenWords.get(currentWord) > wordCount.get(currentWord)) {
                        break;
                    }
                } else {
                    break;
                }

                j++;
            }

            if (j == words.length) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};

        List<Integer> indices = findSubstring(s, words);

        System.out.println("Indices of substrings: " + indices);
    }
}
