package ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] temp= {1,6,7,2,9};
		Map<Integer,Integer> map1= new HashMap<Integer,Integer>();
		int [] res = new int [2];
		int target=9;
		for(int i=0;i<temp.length;i++) {
			
			if(map1.containsKey(target-temp[i])) {
			System.out.println(i);
			System.out.println(map1.get(target-temp[i]));
			}
			map1.put(temp[i], i);
		}
	}

}
