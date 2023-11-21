import java.util.Math;
import java.util.Scanner;

public class BreakContinue {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    boolean isPrime = true;
    if (n == 2) {
      System.out.println(n + " is prime");
    } else {
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        System.out.println(n + " is prime");
      } else {
        System.out.println(n + " is not prime");
      }
    }
    // do {
    //   System.out.println("Enter a number");
    //   int n = sc.nextInt();
    //   if (n % 10 == 0) {
    //     break;
    //   }

    //   System.out.println(n);
    // } while (true);

  }
}
