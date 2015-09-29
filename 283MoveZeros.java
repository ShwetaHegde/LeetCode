/*Given an array nums, write a function to move all 0's to the end of it while maintaining 
the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, 
nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations. */

//Author : Shweta Hegde
public class Solution {
    public void moveZeroes(int[] nums) {
        
        if ( nums.length == 1) return;
        
        int pos = 0;
        for ( int i = 0; i < nums.length; ++i ) {
            
            if ( nums[i] != 0 ) {
                
                nums[pos++] = nums[i];
            }
        }
        for ( int i = pos; i < nums.length; ++i ) {
            
            nums[pos] = 0;
        }
    }
}