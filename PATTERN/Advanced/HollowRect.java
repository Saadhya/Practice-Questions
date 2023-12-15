package Advanced;

public class HollowRect {

  public static void hollowRect(int rows, int cols) {
    // outer loop
    for (int i = 1; i <= rows; i++) {
      // inner loop
      for (int j = 1; j <= cols; j++) {
        // cells
        if (i == 1 || i == rows || j == 1 || j == cols) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void halfPyramid(int rows, int cols) {
    // outer
    for (int i = 1; i <= rows; i++) {
      // for spaces
      for (int k = 1; k <= rows - i; k++) {
        System.out.print(" ");
      }
      // for stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void halfPyramidInverted(int rows) {
    // outer
    for (int i = 0; i < rows; i++) {
      // for stars
      for (int j = 1; j <= rows - i; j++) {
        System.out.print("*");
      }
      // for spaces
      //   for (int k = 1; k <= i; k++) {
      //     System.out.print(" ");
      //   }

      System.out.println();
    }
  }

  public static void halfPyramidNumbers(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  public static void floydTriangle(int n) {
    int counter = 1;
    // outer loop
    for (int i = 1; i <= n; i++) {
      // inner loop
      for (int j = 1; j <= i; j++) {
        System.out.print(counter + " ");
        counter++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // halfPyramid(4, 4);
    // halfPyramidInverted(4);
    // hollowRect(4, 5);
    // halfPyramidNumbers(5);
    floydTriangle(5);
  }
}
