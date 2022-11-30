/**
 *  @author WasitShafi
 *  @since 12-SEP-2020
 */

class Solution {
  public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
    int count = 0;
    int length = startTime.length;
      
    for (int i = 0; i < length; i++) {
      if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
        count++;
      } 
    }
    return count;
  }
}