import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {

    public static int totalFruit(int[] tree) {
        Map<Integer, Integer> fruitCount = new HashMap<>();
        int maxFruits = 0;
        int start = 0;

        for (int end = 0; end < tree.length; end++) {
            fruitCount.put(tree[end], fruitCount.getOrDefault(tree[end], 0) + 1);

            while (fruitCount.size() > 2) {
                fruitCount.put(tree[start], fruitCount.get(tree[start]) - 1);
                if (fruitCount.get(tree[start]) == 0) {
                    fruitCount.remove(tree[start]);
                }
                start++;
            }

            maxFruits = Math.max(maxFruits, end - start + 1);
        }

        return maxFruits;
    }

    public static void main(String[] args) {
        int[] tree = {1, 2, 1, 2, 3};
        int result = totalFruit(tree);
        System.out.println("Maximum number of fruits: " + result);
    }
}
