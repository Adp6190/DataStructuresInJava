package binarysearch;

public class BinarySearch {

	public int binarySearch(int[] arr, int key) {

		int left = 0;
		int right = arr.length - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid])
				return mid;
			if (key < arr[mid]) {
				right = mid - 1;

			}

			else
				left = mid + 1;

		}

		return -1;

	}

}
