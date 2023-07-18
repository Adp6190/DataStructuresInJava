package ARRAYS;

public class highestAltitude {
	public static void main(String [] args) {
		int [] temp= {-1,-4,1,5,0,-7};
		int max=0;
		int sum=0;
		for(int i=0;i<temp.length;i++) {
			sum=+temp[i];
			if(max<sum) {
				max=sum;
			}
		}
		System.out.println("highest altitude is "+max);
		
	}

}
