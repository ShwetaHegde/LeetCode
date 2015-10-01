/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree {3,9,20,#,#,15,7},
    3
   / \
  9  20
    /  \
   15   7
return its level order traversal as:
[
  [3],
  [9,20],
  [15,7]
]
*/

//Author : Shweta Hegde
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> levelOrderedList = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new java.util.LinkedList<TreeNode>();
        
        if ( root == null ) return levelOrderedList;
        queue.add(root);
        
        while ( !queue.isEmpty() ) {
            
            int lengthOfQueue = queue.size();
            List<Integer> subLevelList = new LinkedList<Integer>();
            
            for ( int i = 0; i < lengthOfQueue; ++i ) {
                
                if ( queue.peek().left != null ) queue.add( queue.peek().left );
                if ( queue.peek().right != null ) queue.add( queue.peek().right );
                
                subLevelList.add( queue.poll().val );
            }
            levelOrderedList.add(subLevelList);
        }
        return levelOrderedList;
    }
}