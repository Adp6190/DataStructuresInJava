package ARRAYS;

import java.util.Arrays;

public class convertArrayToPrefix {
	public static void main(String [] args) {
		
		int [] temp= {5,7,2,3,2};
		int [] ans= new int [temp.length];
		ans[0]=temp[0];
		for(int i=1;i<temp.length;i++) {
			ans[i]=temp[i]^ans[i-1];
		}
		System.out.println(" EXOR array is"+Arrays.toString(ans));
		
		int [] arr= new int [temp.length];
		arr[0]=ans[0];
		for(int i=1;i<temp.length;i++) {
			arr[i]=ans[i]^ans[i-1];
		}
		System.out.println( "orignal array is "+Arrays.toString(arr));
	}
}
