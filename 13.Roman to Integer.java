/**
 *  @author WasitShafi
 *  @since  15-AUG-2021
 */
class Solution {
  public int romanToInt(String s) {
    int ans = 0;
    int n = s.length();
    
    for (int i = 0; i < n; i++) {
      switch (s.charAt(i)) {
        case 'I':
          if (i + 1 < n && s.charAt(i+1) == 'V') {
            ans += 4;
            i++;
          } else if (i + 1 < n && s.charAt(i+1) == 'X') {
            ans += 9;
            i++;
          } else {
            ans++;
          }
          break;
        case 'V':
          ans += 5;
          break;
        case 'X':
          if (i + 1 < n && s.charAt(i+1) == 'L') {
            ans += 40;
            i++;
          } else if (i + 1 < n && s.charAt(i+1) == 'C') {
            ans += 90;
            i++;
          } else {
            ans += 10;
          }
          break;
        case 'L':
          ans += 50;
          break;
        case 'C':
          if (i + 1 < n && s.charAt(i+1) == 'D') {
            ans += 400;
            i++;
          } else if (i + 1 < n && s.charAt(i+1) == 'M') {
            ans += 900;
            i++;
          } else {
            ans += 100;
          }
          break;
        case 'D':
          ans += 500;
          break;
        case 'M':
          ans += 1000;
          break;
      }
    }
    return ans;
  }
}
