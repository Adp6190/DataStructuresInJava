package ARRAYS;

import java.util.Scanner;

public class shiftZero {
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int [] temp= {0,1,2,3,0,8,0,8};
		int j=0;
		for(int i=0;i<temp.length;i++) {
			if(temp[i]!=0) {
				int t=temp[j];
				temp[j]=temp[i];
				temp[i]=t;
				j++;
			}
		}
		System.out.println("ans is");
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		
	}

}
