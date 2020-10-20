class Solution {
  public String convertToTitle(int n) {
    if (n <= 26) {
      return new String("" + (char)('A' + n - 1));
    } else {
      StringBuilder ans = new StringBuilder("");
      
      int rem = 0;
      
      while (n != 0) {
        rem = n % 26;
        if (rem == 0) {
          ans.insert(0, 'Z');
        } else {
          ans.insert(0, (char)('A' + rem-1));  
        }
        n = n / 26;
      }
      return ans.toString();
    }
  }
}