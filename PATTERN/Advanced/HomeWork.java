package Advanced;

public class HomeWork {

  public static void fillSquare(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void fillTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      //   for (int j = 1; j <= (2 * i) - 1; j++) {
      //     System.out.print("*");
      //   }
      System.out.println();
    }
  }

  public static void hollowTriangle(int n) {
    for (int i = 1; i <= n; i++) { //3
      for (int j = 1; j <= n - i; j++) { //2
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) { //3
        if (i == 1 || j == 1 || j == i || i == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }

      System.out.println();
    }
  }

  public static void hollowRevTriangle(int n) {
    for (int i = n; i >= 1; i--) { //3
      //   spaces
      for (int j = 1; j <= n - i; j++) { //2
        System.out.print(" ");
      }
      //   star
      for (int j = 1; j <= i; j++) { //3
        if (i == 1 || j == 1 || j == i || i == n) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }

      System.out.println();
    }
  }

  public static void rightPyramid(int n) {
    for (int i = 1; i <= n; i++) {
      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }

  public static void rightPTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
      // stars
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }
  }

  public static void damruPattern(int n) {
    for (int i = n; i >= 1; i--) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // nums
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
    }
    for (int i = 2; i <= n; i++) {
      // spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      // nums
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }

      System.out.println();
    }
  }

  public static void main(String[] args) {
    // fillSquare(5);
    // fillTriangle(5);
    // hollowTriangle(5);
    // rightPyramid(5);
    // rightPTriangle(5);
    // hollowRevTriangle(5);
    damruPattern(5);
  }
}
