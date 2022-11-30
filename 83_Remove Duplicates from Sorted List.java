/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 *  @author WasitShafi
 *  @since 19-SEP-2020
 */

class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode cur = null;
    ListNode temp = head;
    
    while (temp != null) {
      // Always adding the last occurence of dublicate elements if any
      if (temp.next == null || (temp.val != temp.next.val)) {
        if (cur == null) { 
          head = temp; // set the head of the linkedlist
          cur = head;
        } else {
          cur.next = temp; 
          cur = cur.next;
        }
      }
      temp = temp.next; // move pointer to next node
    }
    return head;
  }
}