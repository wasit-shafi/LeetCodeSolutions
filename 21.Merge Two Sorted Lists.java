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
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    
    if (l1 == null) {
      return l2;
    } else if (l2 == null) {
      return l1;
    }
    
    int v;
    ListNode l3 = null;
    ListNode cur1 = l1;
    ListNode cur2 = l2;
    ListNode cur3 = l3;
    while (cur1 != null && cur2 != null) {
      if (cur1.val < cur2.val) {
        v = cur1.val;
        cur1 = cur1.next;
      } else {
        v = cur2.val;
        cur2 = cur2.next;
      }
      
      if (l3 != null) {
        cur3.next = new ListNode(v);
        cur3 = cur3.next;
      } else {
        l3 = new ListNode(v);
        cur3 = l3;
      }
      
      if (cur1 != null) {
        cur3.next = cur1;
      }
      if (cur2 != null) {
        cur3.next = cur2;
      }
    }
    return l3;
  }
}