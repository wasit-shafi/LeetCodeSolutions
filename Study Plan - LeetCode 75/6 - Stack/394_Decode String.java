/**
 * @author WasitShafi
 * @since 02-NOV-2025
 */

class Solution {
  public String decodeString(String s) {
    int i = 0;
    Stack<Character> stack = new Stack<>();
    StringBuilder output = new StringBuilder("");

    while (i < s.length()) {
      if (s.charAt(i) != ']') {
        stack.push(s.charAt(i));
      } else {
        StringBuilder tempStr = new StringBuilder("");
        while (stack.peek() != '[') {
          tempStr.append(stack.pop());
        }
        stack.pop(); // revmoving '['

        StringBuilder k = new StringBuilder("");
        while (!stack.empty() && stack.peek() >= '0' && stack.peek() <= '9') {
          k.append(stack.pop());
        }
        k.reverse();
        int frequency = 0;

        for (int j = 0; j < k.length(); j++) {
          frequency = frequency * 10 + (k.charAt(j) - '0'); // to make string 'k' of type int
        }

        String repeatedTempStr = tempStr.reverse().toString().repeat(frequency);

        for (int j = 0; j < repeatedTempStr.length(); j++) {
          stack.push(repeatedTempStr.charAt(j));
        }
      }
      i++;
    }

    while (!stack.empty()) {
      output.append(stack.pop());
    }

    return output.reverse().toString();
  }
}