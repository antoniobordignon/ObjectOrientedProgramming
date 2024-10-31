public class Diagonal {
  public static void printMainDiagonal(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      System.out.print(matriz[i][i] + " ");
    }
    System.out.println();
  }
}