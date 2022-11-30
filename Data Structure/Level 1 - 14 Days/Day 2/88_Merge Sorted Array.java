/**
 * @author WasitShafi
 * @since 27-NOV-2022
 */
// Question:https://leetcode.com/problems/merge-sorted-array/?envType=study-plan&id=data-structure-i
class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int num1Left = m - 1, num1Right = m + n - 1, num2Right = n - 1;

    while (num1Left >= 0 && num2Right >= 0) {
      if (nums1[num1Left] >= nums2[num2Right]) {
        nums1[num1Right--] = nums1[num1Left--];
      } else {
        nums1[num1Right--] = nums2[num2Right--];
      }
    }

    // check for if nums2 still have some elements
    while (num2Right >= 0) {
      nums1[num1Right--] = nums2[num2Right--];
    }
  }
}