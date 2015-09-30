/*You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways 
can you climb to the top?*/

//Author : Shweta Hegde
public class Solution {
    public int climbStairs(int n) {
        
        if ( n == 0 ) return 0;
        if ( n == 1 ) return 1;
        
        int climb1 = 0, climb2 = 1, climb = 0;
        
        for ( int i = 0; i < n ; ++i ) {
            
            climb = climb1 + climb2;
            climb1 = climb2;
            climb2 = climb;
        }
        return climb;
    }
}