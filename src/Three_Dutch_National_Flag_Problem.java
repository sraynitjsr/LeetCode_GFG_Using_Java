class Three_Dutch_National_Flag_Problem {
    public static void customSort(int arr[], int size) {
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for(int i = 0; i < size; i++) {
            if(arr[i] == 0) {
                countZero++;
            }
            if(arr[i] == 1) {
                countOne++;
            }
            if(arr[i] == 2) {
                countTwo++;
            }
        }
        int index = 0;
        while(countZero > 0) {
            arr[index] = 0;
            countZero--;
            index++;
        }
        while(countOne > 0) {
            arr[index] = 1;
            countOne--;
            index++;
        }
        while(countTwo > 0) {
            arr[index] = 2;
            countTwo--;
            index++;
        }
        System.out.print("Sorted Array is => ");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void start() {
        System.out.println("\nInside Third Module");
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = arr.length;
        customSort(arr, n);
    }
}
