/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times. 
The algorithm should run in linear time and in O(1) space.
*/

//Author : Shweta Hegde

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> majorityElementsList = new ArrayList<Integer>();
        if ( nums == null ) return majorityElementsList;
        
        Map<Integer, Integer> mapElements = new HashMap<Integer, Integer>();
        
        for ( int i = 0; i < nums.length; ++i ) {
            
            if ( mapElements.containsKey(nums[i]) ) {
                
                mapElements.put( nums[i], mapElements.get(nums[i]) + 1 );
            }
            else {
                
                mapElements.put( nums[i], 1);
            }
        }
        
        for ( Integer key : mapElements.keySet() ) {
            
            if ( mapElements.get(key) > nums.length / 3 ) {
                
                majorityElementsList.add(key);
            }
        }
        return majorityElementsList;
    }
}
