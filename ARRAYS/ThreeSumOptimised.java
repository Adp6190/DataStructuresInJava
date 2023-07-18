package ARRAYS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSumOptimised {
	public static void main(String [] args) {
		
		int [] nums= {-1,0,1,2,-1,-4};
		
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			Map<Integer,Integer>map1= new HashMap<Integer,Integer>();
			for(int j=i+1;j<nums.length;j++) {
				
				int third=-1*(nums[i]+nums[j]);
				if(map1.containsKey(third)) {
					List<Integer>newList=new ArrayList<>();
					newList.add(nums[i]);
					newList.add(third);
					newList.add(nums[j]);
					Collections.sort(newList);
					if(!list.contains(newList)) {
						list.add(newList);
					}
					
				}
				map1.put(nums[j], j);
				
			}
		}
		System.out.println(list.toString());
	}
}
