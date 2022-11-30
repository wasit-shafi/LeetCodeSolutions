/**
 *  @author WasitShafi
 *  @since 18-SEP-2020
 */

class Solution {
  public static boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? true : false;
  }
  
  public int dayOfYear(String date) {
    int dd = 0;
    int mm = 0;
    int yyyy = 0;
    int days[] = new int[12];
    
    dd = (date.charAt(9) - '0');
    dd += (date.charAt(8) - '0') * 10;
    mm = (date.charAt(6) - '0');
    mm += (date.charAt(5) - '0') * 10;
    yyyy = (date.charAt(3) - '0');
    yyyy += (date.charAt(2) - '0') * 10;
    yyyy += (date.charAt(1) - '0') * 100;
    yyyy += (date.charAt(0) - '0') * 1000;
    
    days[0] = 31;
    days[1] = days[0] + 28; // non-leap year
    days[2] = days[1] + 31;
    days[3] = days[2] + 30;
    days[4] = days[3] + 31;
    days[5] = days[4] + 30;
    days[6] = days[5] + 31;
    days[7] = days[6] + 31;
    days[8] = days[7] + 30;
    days[9] = days[8] + 31;
    days[10] = days[9] + 30;
    days[11] = days[10] + 31;
    
    if (mm == 1) {
      return dd;
    } else if (mm == 2) {
      return days[0] + dd;
    } else if (isLeapYear(yyyy)) {
      return days[mm - 2] + dd + 1;
    } else {
      return days[mm - 2] + dd;
    }
  }
}