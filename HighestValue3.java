public class HighestValue3 {
  public static int searchValue(int[] vet) {
    int highestValue = 0;
    for (int i : vet) {
      if (i > highestValue) {
        highestValue = i;
      }
    }
    return highestValue;
  }
}
