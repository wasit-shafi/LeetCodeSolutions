/**
 * @author WasitShafi
 * @since 22-SEP-2025
 */

class Solution {
  public String removeStars(String s) {
    StringBuilder output = new StringBuilder();
    Stack<Character> stack = new Stack<Character>();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '*') {
        stack.pop();
      } else {
        stack.push(s.charAt(i));
      }
    }

    while (!stack.isEmpty()) {
      output.append(stack.pop());
    }

    return output.reverse().toString();
  }
}