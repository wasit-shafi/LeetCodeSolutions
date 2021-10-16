/**
 *  @author WasitShafi
 *  @since 15-AUG-2021
 */

 class Solution {
  public int romanToInt(String s) {
    int ans = 0;
    int n = s.length();
    Map<String, Integer> romanValue = new HashMap<>();
    
    romanValue.put("I", 1);
    romanValue.put("IV", 4);
    romanValue.put("V", 5);
    romanValue.put("IX", 9);
    romanValue.put("X", 10);
    romanValue.put("XL", 40);
    romanValue.put("L", 50);
    romanValue.put("XC", 90);
    romanValue.put("C", 100);
    romanValue.put("CD", 400);
    romanValue.put("D", 500);
    romanValue.put("CM", 900);
    romanValue.put("M", 1000);
    
    for (int i = 0; i < n; i++) {
      switch (s.charAt(i)) {
        case 'I':
          if (i + 1 < n && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
            ans += romanValue.get(s.substring(i, i++ + 2));
          } else {
            ans += romanValue.get(s.substring(i, i + 1));
          }
          break;
        case 'V':
          ans += romanValue.get(s.substring(i, i + 1));
          break;
        case 'X':
          if (i + 1 < n && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
            ans += romanValue.get(s.substring(i, i++ +2));
          } else {
            ans += romanValue.get(s.substring(i, i + 1));
          }
          break;
        case 'L':
          ans += romanValue.get(s.substring(i, i + 1));
          break;
        case 'C':
          if (i + 1 < n && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
            ans += romanValue.get(s.substring(i, i++ + 2));
          } else {
            ans += romanValue.get(s.substring(i, i + 1));
          }
          break;
        case 'D':
          ans += romanValue.get(s.substring(i, i + 1));
          break;
        case 'M':
          ans += romanValue.get(s.substring(i, i + 1));
          break;
      }
    }
    return ans;
  }
}
