/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */

class Solution {
  public void deleteNode(ListNode node) { // This is actuall wrong Q accoding to me...we will be only able to modify current node instead of deleting it.
    node.val = node.next.val;
    node.next = node.next.next;
  }
}