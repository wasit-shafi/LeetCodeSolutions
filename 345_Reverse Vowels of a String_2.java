/**
 *  @author WasitShafi
 *  @since 22-SEP-2020
 */

class Solution {
  public static boolean isVowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ? true : false;
  }
  
  public String reverseVowels(String s) {
    int i;
    int j;
    char c;
    int length = s.length();
    char[] str = new char[length];
    
    for(int k = 0; k < length; k++) {
      str[k] = s.charAt(k);
    }

    i = 0;
    j = length - 1;
    while (i < j) {
      while (i < j && !isVowel(str[i])) {
        i++;
      }
      while (i < j && !isVowel(str[j])) {
        j--;
      }
      
      c = str[i];
      str[i] = str[j];
      str[j] = c;
      i++;
      j--;
    }
    
    return new String(str);
  }
}