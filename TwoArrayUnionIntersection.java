import java.util.*;

public class TwoArrayUnionIntersection {
    static void union(int arr1[], int arr2[], int n1, int n2) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n1; i++)
            s.add(arr1[i]);
        for (int i = 0; i < n2; i++)
            s.add(arr2[i]);
        System.out.print("Union => ");
        for (int itr : s) {
            System.out.print(itr + " ");
        }
        System.out.println();
    }

    static void intersection(int arr1[], int arr2[], int n1, int n2) {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < n1; i++)
            s.add(arr1[i]);
        System.out.print("Intersection => ");
        for (int i = 0; i < n2; i++) {
            if (s.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
    }

    public static void start() {
        System.out.println("Union and Intersection of Two Unsorted Arrays");
        int first[] = { 10, 40, 50, 20, 30, 60, 70 };
        int second[] = { 30, 45, 85, 20, 70 };
        union(first, second, first.length, second.length);
        intersection(first, second, first.length, second.length);
    }
}
