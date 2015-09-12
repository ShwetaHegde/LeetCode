/*
Reverse a singly linked list.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 //Author : Shweta Hegde
 
public class Solution {
    public ListNode reverseList(ListNode head) {
        
        if ( head == null || head.next == null ) return head;
        
        ListNode cur = head; 
        ListNode prev = null;
        
        while ( cur != null ) {
         
               ListNode next = cur.next ;
               
               cur.next = prev ;
               prev = cur ;
               cur = next ;
        }
        
        head = prev;
        return head;
    }
}
