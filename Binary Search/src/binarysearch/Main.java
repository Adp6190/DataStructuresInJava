package binarysearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int size;
		int arr[];
		int key;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array\n");
		size=sc.nextInt();
		arr =new int[size];
		System.out.println("Enter Array Elements:  ");
		for(int i=0;i<=size-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Number you want to search with binary Search\n");
		key=sc.nextInt();
//		BinarySearch bs= new BinarySearch();
//		System.out.println(bs.binarySearch(arr, key));

		BinarySearchWithRecursion bsr=new BinarySearchWithRecursion();
		System.out.println(bsr.binarySearchWithRecursion(arr, key, 0, arr.length-1));
		

	}

}
