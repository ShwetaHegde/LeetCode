/*
Determine whether an integer is a palindrome. Do this without extra space.
*/

//Author : Shweta Hegde
public class Solution {
    public boolean isPalindrome(int x) {
        
        int number = x;
        int reverse = 0;
        
        while (x > 0) {
            
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }
        
        if (reverse == number){
            return true;
        }
        else
            return false;
        
    }
}
