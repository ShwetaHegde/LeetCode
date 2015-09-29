/*Given two strings s and t, write a function to determine if t is an anagram of s.

For example,
s = "anagram", t = "nagaram", return true.
s = "rat", t = "car", return false.

Note:
You may assume the string contains only lowercase alphabets.*/

//Author : Shweta Hegde
public class Solution {
    public boolean isAnagram(String s, String t) {
        
        if ( s.length() != t.length() ) return false;
        
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        
        for ( int i = 0; i < s.length(); ++i ) {
            
            char charInS = s.charAt(i);
            if ( charMap.containsKey(charInS) )  {
                
                charMap.put( charInS, charMap.get(charInS) + 1 );
            }
            else {
                
                charMap.put( charInS, 1);
            }
        }
        
        for ( int i = 0; i < t.length(); ++i ) {
            
            char charInT = t.charAt(i);
            if ( charMap.containsKey(charInT) && charMap.get(charInT) > 0 ) {
                
                charMap.put ( charInT, charMap.get(charInT) - 1 );
            }
            else {
                
                return false;
            }
        }
        return true;
    }
}