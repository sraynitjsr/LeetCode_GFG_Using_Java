import java.util.*;
import java.io.*;

public class SortArrayAfterSquaring {
    public static void start() {
            System.out.println("Inside Sorting Array After Squaring");
            
            int arr[] = { -6, -3, -1, 2, 4, 5 };

            System.out.println("Before Sorting and Squaring");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * arr[i];
            }

            System.out.println("\nAfter Squaring");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            Arrays.sort(arr);

            System.out.println("\nAfter Sorting and Squaring");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
