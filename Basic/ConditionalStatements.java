import java.util.Scanner;

public class ConditionalStatements {

  public static void main(String args[]) {
    // int a = 1, b = 3;
    // if (a >= b) {
    //   System.out.println(a);
    // } else {
    //   System.out.println(b);
    // }
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    if (number % 2 == 0) {
      System.out.println("EVEN");
    } else {
      System.out.println("ODD");
    }
  }
}
