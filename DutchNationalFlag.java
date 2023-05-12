public class DutchNationalFlag {
    public static void start() {
        System.out.println("Dutch National Flag Problem");

        int myArray[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        System.out.print("Input Array is => ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println("\nOutput Array is");

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                System.out.print("0 ");
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 1) {
                System.out.print("1 ");
            }
        }
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 2) {
                System.out.print("2 ");
            }
        }
        System.out.println("");
    }
}
