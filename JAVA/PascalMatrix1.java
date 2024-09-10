public class PascalMatrix1 {

  public static long factorial(int n) {
      long result = 1;
      for (int i = 2; i <= n; i++) {
          result *= i;
      }
      return result;
  }

  public static long binomialCoefficient(int n, int k) {
      if (k > n) return 0;
      return factorial(n) / (factorial(k) * factorial(n - k));
  }

  public static void main(String[] args) {
      int rows = 6;

      for (int i = 0; i < rows; i++) {

          for (int space = 0; space < (rows - i - 1); space++) {
              System.out.print("  ");
          }

          for (int j = 0; j <= i; j++) {
              long coef = binomialCoefficient(i, j);
              System.out.print(String.format("%4d", coef));
          }
          System.out.println();
  }
}
}


