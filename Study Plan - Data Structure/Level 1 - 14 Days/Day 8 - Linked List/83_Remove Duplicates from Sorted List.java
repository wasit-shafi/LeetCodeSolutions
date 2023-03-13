
/**
 * @author WasitShafi
 * @since 03-DEC-2022
 */
// Question: https://leetcode.com/problems/remove-duplicates-from-sorted-list/?envType=study-plan&id=data-structure-i

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
  public ListNode deleteDuplicates(ListNode head) {
    ListNode currentNode = head;
    ListNode previousNode = null;

    if (head == null || head.next == null) {
      return head;
    }
    while (currentNode != null) {
      previousNode = currentNode;
      currentNode = currentNode.next;

      while (currentNode != null && currentNode.val == previousNode.val) {
        currentNode = currentNode.next;
      }

      if (currentNode == null) {
        previousNode.next = null;
      } else if (previousNode.next != currentNode) {
        previousNode.next = currentNode;
      }
    }
    return head;
  }
}