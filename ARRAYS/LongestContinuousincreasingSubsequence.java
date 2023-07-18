package ARRAYS;

public class LongestContinuousincreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ans= {1,3,5,3,7}; // maximum length of increasing series
		int max=0,count=1;
		for(int i=0;i<ans.length-1;i++) {
			if(ans[i]<ans[i+1]) {
				count++;
				if(max<count)
					max=count;
			}else
			{
				if(max<count)
					max=count;
				count=1;
			}
			if(i==ans.length-1) {
				if(ans[ans.length-1]<ans[ans.length])
					max++;
			}
	}
		System.out.println(" maximum length is"+max);

}
}
