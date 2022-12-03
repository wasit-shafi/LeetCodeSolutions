
/**
 * @author WasitShafi
 * @since 03-DEC-2022
 */
// Question: https://leetcode.com/problems/reverse-linked-list/?envType=study-plan&id=data-structure-i

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
  public ListNode reverseList(ListNode head) {
    ListNode slowPointer = head;
    ListNode fastPointer = head;
    ListNode rightPointer = null;
    Stack<ListNode> stack = new Stack<ListNode>();

    if (head == null || head.next == null) {
      return head;
    }

    while (fastPointer != null && fastPointer.next != null && fastPointer.next.next != null) {
      slowPointer = slowPointer.next;
      fastPointer = fastPointer.next.next;
    }

    rightPointer = slowPointer.next;
    while (rightPointer != null) {
      stack.push(rightPointer);
      rightPointer = rightPointer.next;
    }
    slowPointer = head;
    while (!stack.isEmpty()) {
      slowPointer.val = slowPointer.val + stack.peek().val;
      stack.peek().val = slowPointer.val - stack.peek().val;
      slowPointer.val = slowPointer.val - stack.peek().val;
      stack.pop();
      slowPointer = slowPointer.next;
    }
    return head;
  }
}