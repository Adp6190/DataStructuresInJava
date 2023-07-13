package binarysearch;

public class BinarySearchWithRecursion {
public int binarySearchWithRecursion(int arr[], int key, int left, int right) {
	int index;
	int mid= (left+right)/2;
	if(right<left) {
		return -1;
	}
	if(key== arr[mid]) {
		return mid;
	}
	if(key<arr[mid]) {
		index =binarySearchWithRecursion(arr, key, left, mid-1);
	}
		else
		index =	binarySearchWithRecursion(arr, key, mid+1, right);
	
	
	return index;
	
	
}
}
