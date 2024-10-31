public class HighestValue2 {
  public static int maior(int a, int b, int c, int d) {
    int highestValue = 0;
    int[] arr = new int[] { a, b, c, d };

    for (int i : arr) {
      if (i > highestValue) {
        highestValue = i;
      }
    }
    return highestValue;
  }

}