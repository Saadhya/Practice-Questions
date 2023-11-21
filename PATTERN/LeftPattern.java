public class LeftPattern {

  public static void printPattern() {
    for (int line = 1; line <= 8; line++) {
      for (int star = 1; star <= line; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void printInvertedPattern(int n) {
    for (int line = 1; line <= n; line++) {
      for (int star = 1; star <= n - line + 1; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void halfPyramid(int n) {
    for (int line = 1; line <= n; line++) {
      for (int num = 1; num <= line; num++) {
        System.out.print(num);
      }
      System.out.println();
    }
  }

  public static void charPattern(int n) {
    char ch = 'A';
    for (int line = 1; line <= n; line++) {
      for (int num = 1; num <= line; num++) {
        System.out.print(ch);
        ch++;
      }
      System.out.println();
    }
  }

  public static void rightPattern(int n) {
    for (int line = 1; line <= n; line++) {
      for (int j = n - line + 1; j > 1; j--) {
        System.out.print(" ");
      }
      for (int star = 1; star <= line; star++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void fullPyramid(int n) {
    for (int line = 1; line <= n; line++) { //outer loop 1
      for (int j = n - line + 1; j > 1; j--) { // 4
        System.out.print(" ");
      }
      for (int star = 1; star > n - line; star = star + 2) { //1, 3, 5, 7
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void floydTriangle(int n) {
    int num = 1;
    for (int line = 1; line <= n; line++) {
      for (int j = 1; j <= line; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    // printPattern();
    int n = 5;
    // printInvertedPattern(n);
    // halfPyramid(n);
    // charPattern(n);
    // rightPattern(n);
    fullPyramid(n);
    // floydTriangle(n);
  }
}
