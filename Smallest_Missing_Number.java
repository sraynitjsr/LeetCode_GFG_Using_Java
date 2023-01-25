public class Main
{
	public static int getFirstMissing(int array[], int start, int end)
	{
		if (start > end)
			return end + 1;

		if (start != array[start])
			return start;

		int mid = (start + end) / 2;

		if (array[mid] == mid)
			return getFirstMissing(array, mid+1, end);

		return getFirstMissing(array, start, mid);
	}

	public static void main(String[] args)
	{
		int arr[] = {0, 1, 2, 6, 4, 5, 8, 7, 10};
		int n = arr.length;
		System.out.println("First Missing Element is => " + getFirstMissing(arr, 0, n - 1));
	}
}
