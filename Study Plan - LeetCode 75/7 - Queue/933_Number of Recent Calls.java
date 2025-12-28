/**
 * @author WasitShafi
 * @since 28-DEC-2025
 */

class RecentCounter {
  List<Integer> array;

  public RecentCounter() {
    this.array = new ArrayList<Integer>();
  }

  public int ping(int t) {
    int count = 1;
    int n = this.array.size() - 1;

    for (int i = n; i >= 0 && t - this.array.get(i) <= 3000; i--) {
      count++;
    }
    array.add(t);
    return count;
  }
}