<<<<<<< HEAD
=======

>>>>>>> 585199eb8f59730a4cc54cf3837e8dc155b0ee49
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
    
    for (int i = sb.length() - 1; i >= 0; i--) {
      if (sb.charAt(i) == '1') {
        ans += powOf2;
      }
      powOf2 *= 2;
    }
    
    return ans;
  }
}