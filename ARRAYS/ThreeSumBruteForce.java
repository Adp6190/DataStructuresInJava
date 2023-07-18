package ARRAYS;

public class ThreeSumBruteForce {
	public static void main(String[] args) {
		int[] temp = { -1, 0, 1, 2, -1, -4 };
		int n = temp.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i != j) && (i<n-1))
					if (temp[i] + temp[i + 1] + temp[j] == 0) {
						System.out.println(temp[i] + "=" + temp[i + 1] + "="+temp[j]);
					}
			}
		}

//		for(int i=0;i<temp.length;i++) {
//			for(int j=i+1;j<temp.length;j++) {
//				for(int k=i;k<j;k++) {
//					if(temp[i]+temp[j]+temp[k]==0) {
//						System.out.println(" "+i+","+k+","+j);
//					}
//				}
//			}
//		}
	}
}
