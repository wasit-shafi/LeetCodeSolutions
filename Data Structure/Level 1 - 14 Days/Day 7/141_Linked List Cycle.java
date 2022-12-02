/**
 * @author WasitShafi
 * @since 02-DEC-2022
 */
// Question: https://leetcode.com/problems/linked-list-cycle/?envType=study-plan&id=data-structure-i

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }
    ListNode slowPointer = head;
    ListNode fastPointer = head.next;
    // floyd's cycle algorithm for detecting cycle in linked list
    while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
      if (slowPointer == fastPointer) {
        return true;
      }
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
    }
    return false;
  }
}