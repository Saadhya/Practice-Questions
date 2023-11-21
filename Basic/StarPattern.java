public class StarPattern {

  public static void main(String args[]) {
    int n = 4;

    int spaces = n - 1, stars = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
      spaces--;
      stars += 2;
    }

    spaces = 0;
    stars = 2 * n - 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
      spaces++;
      stars -= 2;
    }
    // try with if else
    // keep in mind with spaces and stars
  }
}
