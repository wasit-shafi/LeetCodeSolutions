/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */
class Solution {
  public static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ? true : false;
  }
  
  public String reverseVowels(String s) {
    char c;
    int i = 0;
    int j = s.length() - 1;
    StringBuilder sb = new StringBuilder(s);
    
    while (i < j) {
      while (i < j && !isVowel(sb.charAt(i))) {
        i++;
      }
      while (i < j && !isVowel(sb.charAt(j))) {
        j--;
      }
      if(i < j) {
        c = sb.charAt(i);
        sb.replace(i, i+1, "" + sb.charAt(j));
        sb.replace(j, j+1, "" + c);
      }
 
      i++;
      j--;
    }
    
    return sb.toString();
  }
}