class MyFirstBadVersion {

    private static int firstBadVersion;

    public static void setFirstBadVersion(int version) {
        firstBadVersion = version;
    }

    public static boolean isBadVersion(int version) {
        return version >= firstBadVersion;
    }

    public static int findFirstBadVersion(int n) {
        int low = 1;
        int high = n;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void myFirstBadVersion() {
        int n = 5;
        int firstBad = 4;
        setFirstBadVersion(firstBad);
        int firstBadVersion = findFirstBadVersion(n);
        System.out.println("The first bad version is: " + firstBadVersion);
    }
}
