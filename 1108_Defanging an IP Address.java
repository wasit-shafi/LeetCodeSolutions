/**
 *  @author WasitShafi
 *  @since  25-JUL-2021
 */

class Solution {
  public String defangIPaddr(String address) {
    char ch;
    int n = address.length();
    StringBuilder sb = new StringBuilder("");
    
    for (int i = 0; i < n; i++) {
      ch = address.charAt(i); 
      if (ch == '.') {
        sb.append("[.]");
      } else {
        sb.append(ch);
      }
    }
  
    return sb.toString();
  }
}
