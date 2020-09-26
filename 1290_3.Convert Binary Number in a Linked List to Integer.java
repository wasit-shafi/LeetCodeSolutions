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
  public int getDecimalValue(ListNode head) {
    int ans = 0;
    int count = 0;
    ListNode curr = head;
    
    while (curr != null) {
      count++;
      curr = curr.next;
    }
    
    count--;
    curr = head;
    while (curr != null) {
      if (curr.val == 1) {
        ans += Math.pow(2, count);
      }
      count--;
      curr = curr.next;
    }
    return ans;
  }
}