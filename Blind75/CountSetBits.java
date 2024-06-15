public class CountSetBits {    
    static int count(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static void countSetBits() {
        int N = 37;
        System.out.println("Number of 1 bits in " + N + " is: " + count(N));
    }
}
