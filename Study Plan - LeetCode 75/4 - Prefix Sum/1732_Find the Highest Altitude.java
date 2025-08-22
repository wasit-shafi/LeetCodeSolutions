/**
 * @author WasitShafi
 * @since 22-AUG-2025
 */
class Solution {
  public int largestAltitude(int[] gain) {
    int maxAltitude = 0;
    int currentAltitude = 0;

    for (int altitudeGain : gain) {
      currentAltitude = currentAltitude + altitudeGain;

      if (currentAltitude > maxAltitude) {
        maxAltitude = currentAltitude;
      }
    }

    return maxAltitude;
  }
}