class Solution {
    public int mySqrt(int x) {
      int low = 1;
      int high = x/2;
      int mid;
      Long sqrt;
      int floorValue = x;
      
      whil   int mid;
      Long sqrt;
      int floorValue = x;
      
      while (low <= high) {
        mid = low + (high - low) / 2;
        sqrt = (long)mid * mid;
        if (sqrt == x) {
