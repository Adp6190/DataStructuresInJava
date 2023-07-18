package ARRAYS;

public class goodPairs {
	public static void main(String [] args) {
		int [] temp= {1,2,3,1,2,3,4,5,1}; // program to find numbers of good pairs(temp[i]==temp[j] && i<j)
		int count=0;
		for(int i=0;i<temp.length;i++) {
			for(int j=i+1;j<temp.length;j++) {
				if(temp[i]==temp[j]) {
					count++;
				}
			}
		}
		System.out.println(" number of good pairs are"+count);
		
	}

}
