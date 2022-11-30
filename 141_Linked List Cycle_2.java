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
      ListNode curr = head;
      HashSet<ListNode> visited = new HashSet<>();
      
      while (curr != null) {
        if (visited.contains(curr)) {
          return true;
        }
        visited.add(curr);
        curr = curr.next;
      }
      return false;
    }
}