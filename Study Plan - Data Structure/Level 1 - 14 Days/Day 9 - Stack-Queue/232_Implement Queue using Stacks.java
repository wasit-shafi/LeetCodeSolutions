/**
 * @author WasitShafi
 * @since 04-DEC-2022
 */
// Question: https://leetcode.com/problems/implement-queue-using-stacks/?envType=study-plan&id=data-structure-i
class MyQueue {
  Stack<Integer> stackFirst = new Stack<Integer>();
  Stack<Integer> stackSecond = new Stack<Integer>();

  public MyQueue() {
  }

  public void push(int x) {
    stackFirst.push(x);
  }

  public int pop() {
    if (stackSecond.isEmpty()) {
      while (stackFirst.isEmpty() == false) {
        stackSecond.push(stackFirst.pop());
      }
    }
    return stackSecond.pop();
  }

  public int peek() {
    if (stackSecond.isEmpty()) {
      while (stackFirst.isEmpty() == false) {
        stackSecond.push(stackFirst.pop());
      }
    }
    return stackSecond.peek();
  }

  public boolean empty() {
    return stackFirst.isEmpty() && stackSecond.isEmpty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */