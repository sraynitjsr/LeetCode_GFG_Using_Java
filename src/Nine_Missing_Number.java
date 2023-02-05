class Nine_Missing_Number {

	public static int findMissingNumber(int[] nums, int size)
	{
		int sum = ((size + 1) * (size + 2)) / 2;
		for (int i = 0; i < size; i++)
			sum = sum - nums[i];
		return sum;
	}

	public static void start()
	{
		System.out.println("\nInside Ninth Module");
		int[] arr = { 1, 2, 4, 5, 6, 7, 8 };
		System.out.println(findMissingNumber(arr, arr.length));
	}
}
