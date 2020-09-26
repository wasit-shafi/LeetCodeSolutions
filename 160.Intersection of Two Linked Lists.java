/**
 * Definition for singly-linked list.
 * public class ListNode {
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
 *  @since 22-SEP-2020
 */

public class Solution {
  public int getLength(ListNode head){
    int len = 0;
    ListNode temp = head;
    
    while (temp != null) {
      temp = temp.next;
      len++;
    }
    
    return len;
  }
  
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }
  
    ListNode l1 = headA;
    ListNode l2 = headB;
    int lenA = getLength(headA);
    int lenB = getLength(headB);

    int diff = lenA - lenB;
    if (diff < 0) {
      diff *= -1;
    }

    if (lenA > lenB) {
      while (diff-- != 0) {
        l1 = l1.next;
      }
    } else if (lenB > lenA) {
      while (diff-- != 0) {
        l2 = l2.next;
      }
    }
    
    while (l1 != null || l2 != null) {
      if(l1 == l2) {
        return l1;
      }
      l1 = l1.next;
      l2 = l2.next;
    }
    return null;
  }
}