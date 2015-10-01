/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/

//Author : Shweta Hegde

public class Solution {
    public boolean isValid(String s) {
        
        if ( s.equals("") ) return true;
        if ( s.length() % 2 != 0 ) return false;
        
       Stack<Character> charStack = new Stack<Character>();
       
       for ( int i = 0; i < s.length(); ++i ) {
        
           char eachChar = s.charAt(i);
           
           if (eachChar == '(' || eachChar == '{' || eachChar == '[' ) {
               
               charStack.push(eachChar);
           }
           else if ( eachChar == ')' ) {
               
               if ( charStack.isEmpty() || charStack.pop() != '(') return false;
           }
           else if ( eachChar == '}') {
               
               if ( charStack.isEmpty() || charStack.pop() != '{' ) return false;
           }
           else {
               
               if ( charStack.isEmpty() || charStack.pop() != '[' ) return false;
           }
       }
       if ( charStack.isEmpty() ) return true;
       return true;
    }
}