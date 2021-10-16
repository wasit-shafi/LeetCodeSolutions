/**
 *  @author WasitShafi
 *  @since  15-AUG-2021
 */

// Referred Discuss Section
 class Solution {
  public int romanToInt(String s) {
    int ans = 0;
    int n = s.length();
    Map<Character, Integer> romanValue = new HashMap<>();
    
    romanValue.put('I', 1);
    romanValue.put('V', 5);
    romanValue.put('X', 10);
    romanValue.put('L', 50);
    romanValue.put('C', 100);
    romanValue.put('D', 500);
    romanValue.put('M', 1000);
    
    ans = romanValue.get(s.charAt(n-1));
    for (int i = n - 2; i >= 0; i--) {
      if (romanValue.get(s.charAt(i)) < romanValue.get(s.charAt(i+1))) {
            ans -= romanValue.get(s.charAt(i));
      } else {
            ans += romanValue.get(s.charAt(i));
      }
    }
    return ans;
  }
}
