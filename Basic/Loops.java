import java.util.Scanner;

public class Loops {

  public static void main(String args[]) {
    int counter = 1;
    Scanner sc = new Scanner(System.in);

    // question 5
    // while (counter <= 4) {
    //   System.out.println("****");
    //   counter++;
    // }
    for (int i = 0; i <= 4; i++) {
      System.out.println("****");
    }
    // question 4
    // int n = sc.nextInt();
    // int sum = 0;
    // while (counter <= n) {
    //   sum = sum + counter;
    //   counter++;
    // }
    // System.out.println(sum);

    // while (counter < 100) {
    //   System.out.println("Hello world! " + (counter + 1));
    //   counter++;
    // }

    // question 2
    // while (counter <= 10) {
    //   System.out.print(counter + ", ");
    //   counter++;
    // }
    // System.out.println(counter);

    // question 3
    // System.out.println("\nEnter number n");

    // int n = sc.nextInt();
    // while (counter <= n) {
    //   System.out.print(counter + ", ");
    //   counter++;
    // }
    // System.out.println("\n"+counter);
  }
}
