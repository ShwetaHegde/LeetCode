/*
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
*/

//Author : Shweta Hegde

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < nums.length; ++i) {
			
			if (!myMap.containsKey(nums[i])) {
				
				myMap.put(nums[i], i);
			}
			else {
				
				if (i - myMap.get(nums[i])  <= k ) {
					
					return true;
				}
				
				myMap.put(nums[i], i);
			}
		}
		return false;
    }
}

