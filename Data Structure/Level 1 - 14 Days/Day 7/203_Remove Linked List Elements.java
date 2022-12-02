/**
 * @author WasitShafi
 * @since 02-DEC-2022
 */
// Question: https://leetcode.com/problems/remove-linked-list-elements/?envType=study-plan&id=data-structure-i

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
  public ListNode removeElements(ListNode head, int val) {
    ListNode newHead = null;
    ListNode listPointer = head;
    ListNode listPointerPrevious = null;

    while (listPointer != null && listPointer.val == val) {
      listPointer = listPointer.next;
    }
    newHead = listPointer; // can also be null, if all the elements are 'val'

    while (listPointer != null) {
      if (listPointer.val == val) {
        listPointerPrevious.next = listPointer.next;
        listPointer = listPointer.next;
      } else {
        listPointerPrevious = listPointer;
        listPointer = listPointer.next;
      }
    }

    return newHead;
  }
}