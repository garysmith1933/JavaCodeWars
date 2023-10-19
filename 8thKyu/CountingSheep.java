public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    if (arrayOfSheeps.length == 0) return 0;
    int count = 0;
    for (Boolean sheep : arrayOfSheeps) {
      if (sheep != null && sheep == true) count += 1;
    }
    
    return count;
  }
}