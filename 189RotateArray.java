/*
Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
*/

//Author : Shweta Hegde

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        
        k = k % nums.length;
        if (k == 0) {
            
            return;
        }
        reverseArray(nums, 0, nums.length-1 );
        reverseArray(nums, 0, k-1 );
        reverseArray(nums, k, nums.length -1);
    }
    
    public void reverseArray(int[] arrayToReverse, int l, int m ) {
        
        while ( l < m ) {
            
            int temp = arrayToReverse[l];
            arrayToReverse[l] = arrayToReverse[m] ;
            arrayToReverse[m] = temp ;
            ++l ; --m;
        }
    }
    
}
