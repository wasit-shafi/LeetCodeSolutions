/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
/**
 *  @author WasitShafi
 *  @since 19-SEP-2020
 */

public class Solution {
    public boolean hasCycle(ListNode head) {
      if (head == null) {
        return false;
      }
      ListNode fast = head.next;
      while (head != null && fast != null) {
        if (head == fast) {
          return true; 
        }
        head = head.next;
        fast = fast.next;
        if (fast != null) {
          fast = fast.next;
        }
      }
      return false;
    }
}