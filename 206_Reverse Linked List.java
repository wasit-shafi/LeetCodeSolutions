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
 *  @since 23-SEP-2020
 */

class Solution {
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    
    ListNode cur = head;
    Stack<ListNode> stack = new Stack<>();
    
    while (cur != null) {
      stack.push(cur);
      cur = cur.next;
    }
    
    ListNode base = stack.peek();
    cur = base;
    stack.pop();
    
    while (!stack.isEmpty())
    {
      cur.next = stack.peek();
      cur = cur.next;
      stack.pop();
    }
    cur.next = null;
    return base;
  }
}