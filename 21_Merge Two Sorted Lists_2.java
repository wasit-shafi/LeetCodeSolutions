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
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    } else {
      ListNode l3 = null;
      ListNode cur1 = l1;
      ListNode cur2 = l2;
      ListNode cur3 = null;

      if (cur1.val < cur2.val) {
        l3 = l1;
        cur3 = l3;
        cur1 = cur1.next;
      } else {
        l3 = l2;
        cur3 = l3;
        cur2 = cur2.next;
      }

      while (cur1 != null && cur2 != null) {
        if (cur1.val < cur2.val) {
          cur3.next = cur1;
          cur1 = cur1.next;
        } else {
          cur3.next = cur2;
          cur2 = cur2.next;
        }
        cur3 = cur3.next;
      }

      if (cur1 != null) {
        cur3.next = cur1;
      } else {
        cur3.next = cur2;
      }
      return l3;
    }
  }
}