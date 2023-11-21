import java.util.*;

public class LoopQuestion {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    // question 4
    System.out.println("Enter number for table");
    int n = sc.nextInt();
    System.out.println("TABLE for " + n);
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " X " + i + " = " + n * i);
    }
    // javac main.java && java main - run in terminal
    //
    // question 3- factorial
    // int n = sc.nextInt();
    // int fact = 1;

    // for (int i = n; i >= 1; i--) { //3,
    //   fact = fact * i;
    // }
    // System.out.println(fact);

    // question 1
    // for (int i = 0; i <= 5; i++) {
    //   System.out.println("helo");
    //   i += 2;
    // }

    // question 2
    // int num;
    // int evenSum = 0;
    // int oddSum = 0;
    // System.out.println("Enter numbers: ");

    // for (int i = 0; i < 7; i++) {
    //   num = sc.nextInt();
    //   if (num % 2 == 0) {
    //     evenSum += num;
    //   } else {
    //     oddSum += num;
    //   }
    // }
    // System.out.println("Even: " + evenSum);
    // System.out.println("Odd: " + oddSum);

  }
}
