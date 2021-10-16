/**
 *  @author WasitShafi
 *  @since  31-JUL-2021
 */
class Solution {
  public int numJewelsInStones(String jewels, String stones) {
    int ans = 0;
    char ch = ' ';
    int jewelsLength = jewels.length();
    int storesLength = stones.length();
    boolean hasJewelsType[] = new boolean[52];
    
    for (int i = 0; i < jewelsLength; i++) {
      ch = jewels.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {
        hasJewelsType[ch - 'A'] = true;
      } else {
        hasJewelsType[ch - 'a' + 26] = true;
      }
    }
    
    for (int i = 0; i < storesLength; i++) {
      ch = stones.charAt(i);
      if ((ch >= 'A' && ch <= 'Z' && hasJewelsType[ch - 'A']) || (ch >= 'a' && ch <= 'z'  && hasJewelsType[ch - 'a' + 26])) {
        ans++;
      }
    }
    return ans;
  }
}
