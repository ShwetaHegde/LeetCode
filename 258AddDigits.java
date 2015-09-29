/*
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/

//Author : Shweta Hegde

public class Solution {
    public int addDigits(int num) {
        
        int numLength = String.valueOf(num).length();
        
        if ( numLength == 1 ) return num;
        
        while ( numLength > 1) {
        
            int sum = 0;
            
            while ( num != 0 ) {
                
        	    sum += num % 10;
                num = num / 10;
            
            }
            
            numLength = String.valueOf(sum).length();
            num = sum;
        }
        
        return num;
    }
}