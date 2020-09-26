/**
 *  @author WasitShafi
 *  @since 23-SEP-2020
 */

class Solution {
  public boolean isValid(String s) {
    int length = s.length();
    Stack<Character> stack = new Stack<>();
    
    for (int i = 0; i < length; i++) {  
      if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
        stack.push(s.charAt(i));
      } else if (stack.empty()) {
        return false;
      } else {
        if ((s.charAt(i) == ')' && stack.peek() != '(') || (s.charAt(i) == '}' && stack.peek() != '{') || (s.charAt(i) == ']' && stack.peek() != '[')) {
         return false;
        }
        stack.pop();
      }
    }
    
    if (!stack.empty()) {
      return false;
    }
    return true;
  }
}