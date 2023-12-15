package Advanced;

public class BinaryTriangle {

  public static void zeroOneTriangle(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        if ((i + j) % 2 == 0) {
          System.out.print("1");
        } else {
          System.out.print("0");
        }
      }
      System.out.println();
    }
  }

  public static void butterfly(int n) {
    for (int i = 1; i <= n; i++) {
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // second half of butterfly
    for (int i = n - 1; i >= 1; i--) {
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      // spaces
      for (int j = 1; j <= 2 * (n - i); j++) {
        System.out.print(" ");
      }
      // star
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void solid_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // inner for spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void hollow_rhombus(int n) {
    for (int i = 1; i <= n; i++) {
      // inner for spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= n; j++) {
        if (i == 1 || j == 1 || i == n || j == n) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void diamond(int n) {
    for (int i = 1; i <= n; i++) {
      // inner for spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    // for second half
    for (int i = n - 1; i >= 1; i--) {
      // inner for spaces
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // zeroOneTriangle(5);
    // butterfly(4);
    // solid_rhombus(5);
    // hollow_rhombus(7);
    diamond(5);
  }
}
