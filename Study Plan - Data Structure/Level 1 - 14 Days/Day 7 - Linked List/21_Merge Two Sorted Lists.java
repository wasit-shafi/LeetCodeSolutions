/**
 * @author WasitShafi
 * @since 02-DEC-2022
 */
// Question: https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan&id=data-structure-i

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) {
      return list2;
    } else if (list2 == null) {
      return list1;
    }
    // both the list has some elements, find the list which has smallest first element
    ListNode l1 = list1.val <= list2.val ? list1 : list2;
    ListNode l2 = list1.val > list2.val ? list1 : list2;
    ListNode l1Pointer = l1;
    ListNode l1PointerPrevious = null;
    ListNode l2Pointer = l2;

    while (l1Pointer != null && l2Pointer != null) {
      if (l1Pointer.val <= l2Pointer.val) {
        if (l1Pointer.next != null) {
          l1PointerPrevious = l1Pointer;
          l1Pointer = l1Pointer.next;
        } else {
          l1Pointer.next = l2Pointer;
          l1Pointer = null;
        }
      } else {
        ListNode node = new ListNode(l2Pointer.val, l1Pointer);
        
        l1PointerPrevious.next = node;
        // updating the previous node of l1Pointer as we added new node in l1
        l1PointerPrevious = node;
        // move to the next node
        l2Pointer = l2Pointer.next;
      }
    }

    return l1;
  }
}