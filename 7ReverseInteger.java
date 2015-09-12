/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
*/

//Author : Shweta Hegde
public class Solution {
    public int reverse(int x) {
        
        long reverse = 0, digit;
        while (x != 0) {
            
            digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            
            return 0;
        }
        else {
            
            return (int)reverse;
        }
    }
}
