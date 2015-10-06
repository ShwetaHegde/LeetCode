/*
Given an array with n objects colored red, white or blue, sort them so that objects of
 the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.

*/

//Author : Shweta Hegde

public class Solution {
    public void sortColors(int[] nums) {
        
        Map<Integer, Integer> storeColors = new HashMap<Integer, Integer>();
        Set<Integer> keys = new TreeSet<Integer>();
        
        for ( int i = 0; i < nums.length; ++i ) {
            
            if ( storeColors.containsKey(nums[i]) ) {
                
                storeColors.put( nums[i], storeColors.get(nums[i]) + 1);
            }
            
            else {
                
                storeColors.put( nums[i], 1 );
                keys.add(nums[i]);
            }
        }
        
        int i = 0;   
        for ( int key : keys ) {
                
            while ( storeColors.get(key) >= 1 ) {
                
                nums[i] = key;
                storeColors.put (key, storeColors.get(key) - 1 );
                i++;
                
            }
        }
    }
}