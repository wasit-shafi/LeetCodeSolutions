class Solution {
  public String reverseWords(String s) {
    String[] strArray = s.trim().split(" ");
    StringBuilder output = new StringBuilder("");

    for (int i = strArray.length - 1; i >= 0; i--) {
      if (!strArray[i].equals("")) {
        output.append(strArray[i] + " ");
      }
    }

    return output.toString().trim();
  }
}
