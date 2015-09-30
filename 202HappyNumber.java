/*Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: 
Starting with any positive integer, replace the number by the sum of the 
squares of its digits, and repeat the process until the number equals 1 (where it will stay)
or it loops endlessly in a cycle which does not include 1. Those numbers for which this 
process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1 */

//Author : Shweta Hegde

public class Solution {
    
    public boolean isHappy(int n) {
    
        if ( n < 1 ) return false;
        Set<Integer> storeNumbers = new HashSet<Integer>();
        storeNumbers.add(n);
        
        while ( n != 1 ) {
            int sum = 0;
    
            while ( n != 0 ) {
                    
                sum += Math.pow(n % 10, 2);
                n = n / 10;
                    
            }
        
            if (storeNumbers.contains(sum) ) return false;
            
            storeNumbers.add(sum);
            n = sum;
        }
        return true;
    }
}