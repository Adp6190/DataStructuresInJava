package ARRAYS;

import java.util.HashMap;
import java.util.Map;

public class twosum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] temp= {2,7,3,11};
		int target=9;
		
		Map <Integer,Integer>map = new HashMap<>();
		
		for(int i=0;i<temp.length;i++) {
		map.put(temp[i], i);	
		}
		int [] ans= new int [2];
		for(int i=0;i<temp.length;i++) {
			int compli=target-temp[i];
			if(map.containsKey(compli)) {
				temp[0]=i;
				temp[1]=map.get(compli);
			}
			
		}
		System.out.println(temp[0]);
		System.out.println(temp[1]);
	}

}
