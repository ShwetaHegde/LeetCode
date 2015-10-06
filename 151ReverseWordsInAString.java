/*
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
*/

//Author : Shweta Hegde


public class Solution {
    public String reverseWords(String s) {
        
        if ( s == null ) return s;
        if ( s.equals("") ) return s;

        Stack<String> stringStack = new Stack<String>();
        
        String[] strArray = s.split(" ");
        
        for ( String element : strArray ) {
            
            stringStack.push( element );
        }
        
        StringBuilder sb = new StringBuilder();
        while ( !stringStack.isEmpty() ) {
            
            String temp = stringStack.pop().trim();
        	if ( temp.isEmpty() ) {
        		
        		continue;
        	}
            sb.append( " " + temp );
        }
        return sb.toString().trim();
     }
}