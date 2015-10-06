/*
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
Note:
For the return value, each inner list's elements must follow the lexicographic order.
All inputs will be in lower-case.
*/

//Author : Shweta Hegde

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    
        Map<String, List<String>> mapAnagram = new HashMap<String, List<String>>();
        List<List<String>> anagramList = new ArrayList<List<String>>();
        
        if ( strs.length == 0 ) return anagramList;
        Arrays.sort(strs);
        
        for ( String str : strs ) {
            
            String sorted = sortString( str );
            
            if ( mapAnagram.containsKey( sorted ) ) {
                
                mapAnagram.get( sorted ).add(str);
            }
            else {
                
                List<String> subList = new ArrayList<String>();
                subList.add(str);
                mapAnagram.put( sorted, subList );
            }
        }
        for ( String key : mapAnagram.keySet() ) {
            
            anagramList.add( mapAnagram.get(key) );
        }
        return anagramList;
    }
    
    public String sortString(String str) {
        
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        
        return new String(charArray);
    }
}
