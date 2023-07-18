package ARRAYS;

import java.util.Arrays;

public class prefixproduct {
	public static void main(String [] args) {
		int [] temp= {1,2,3,4};
		int [] left= new int [temp.length];
		int [] right= new int [temp.length];
		int [] nums= new int [temp.length];
		 left[0]=0;
		 for(int i=1;i<temp.length;i++) {
			 left[i]=left[i-1]+temp[i-1];
		 }
		 System.out.println(" left product "+Arrays.toString(left));
		right[temp.length-1]=0;
		for(int i=temp.length-2;i>=0;i--) {
			right[i]=right[i+1]+temp[i+1];
		}
		System.out.println("right product is "+Arrays.toString(right));
		 for(int i=0;i<nums.length;i++){
	            nums[i]=left[i]*right[i];
	        }
		 System.out.println(" ans is "+Arrays.toString(nums));
		 String s= "leetcode i am bobby";
		 char [] x=s.toCharArray();
		 Arrays.sort(x);
		 System.out.println("is "+Arrays.toString(x));
		 String [] hj=s.split(" ");
		 System.out.println("array is : "+Arrays.toString(hj));
		 
	}
}
