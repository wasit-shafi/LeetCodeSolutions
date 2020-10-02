class Solution  public int getDecimalValue(ListNode head) {
    int ans = 0;
    int powOf2 = 1;
    ListNode curr = head;
    StringBuilder sb = new StringBuilder("");
    
    while (curr != null) {
      sb.append("" + curr.val);
      curr = curr.next;
    }
    
    for (int i = sb.length() - 1; i >= 0; i--) {
      if (sb.charAt(i) == '1') {
        ans += powOf2;
      }
      powOf2 *= 2;
    }
    
    return ans;
  }
}