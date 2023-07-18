package ARRAYS;

import java.util.Arrays;

public class missingNumber {
	static int missingNumber(int arr[], int size)
    {	
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i=0,j=0;
        for(i=0;i<size-1;i++){
            if(arr[i]>0 && (arr[i+1]!=arr[i]+1))
                return arr[i]+1;
        }
        return arr[size-1]+1;
    }

	public static void main(String args[]) {
		int [] arr= {1 ,-2, 0 ,-1 ,-2 ,1 ,-4, 2, -3};
		System.out.println(" ans is"+missingNumber(arr,arr.length));
	}
}
