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
    int powOf2 = 1;
    ListNode curr = head;
    StringBuilder sb = new StringBuilder("");
    
    while (curr != null) {
      sb.append("" + curr.val);
      curr = curr.next;
    }    
    return Integer.parseInt(sb.toString(), 2);
  }
}