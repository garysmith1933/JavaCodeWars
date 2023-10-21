public class Solution {

  public static int signChange(int[] arr) {
    if (arr.length == 0) return 0;
    int changes = 0;
    
    String plusOrMin = arr[0] < 0 ? "minus" : "plus";
    
    for (int num : arr) {
      String currPlusOrMin =  num < 0 ? "minus" : "plus";
      
      if (currPlusOrMin != plusOrMin) {
        changes += 1;
        plusOrMin = currPlusOrMin;
      }
    }
    return changes;
  }

}