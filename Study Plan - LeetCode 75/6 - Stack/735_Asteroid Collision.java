/**
 * @author WasitShafi
 * @since 06-OCT-2025
 */

class Solution {
  public int[] asteroidCollision(int[] asteroids) {
    int[] output;
    Stack<Integer> stack = new Stack<Integer>();

    for (int currentAsteriod : asteroids) {
      if (stack.isEmpty() || (stack.peek() < 0 && currentAsteriod < 0) || (stack.peek() > 0 && currentAsteriod > 0)
          || (stack.peek() < 0 && currentAsteriod > 0)) {
        stack.push(currentAsteriod);
      } else if (Math.abs(currentAsteriod) == stack.peek()) {
        stack.pop();
      } else {
        while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(currentAsteriod)) {
          stack.pop();
        }

        if (!stack.isEmpty() && stack.peek() == Math.abs(currentAsteriod)) {
          stack.pop();
          continue;
        }

        if (stack.isEmpty() || Math.abs(currentAsteriod) > stack.peek()) {
          stack.push(currentAsteriod);
        }
      }
    }

    output = new int[stack.size()];
    int i = stack.size() - 1;

    while (!stack.isEmpty()) {
      output[i--] = stack.pop();
    }

    return output;
  }
}