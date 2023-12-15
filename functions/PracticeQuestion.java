import java.util.Scanner;

public class PracticeQuestion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number to check even or odd");
    int n = sc.nextInt();

    System.out.println(isEven(n) ? "even" : "odd");

    // System.out.println("Enter number to make average");
    // double a = sc.nextDouble();
    // double b = sc.nextDouble();
    // double c = sc.nextDouble();
    // System.out.println("Average of three numbers: " + average(a, b, c));

    // System.out.println(
    //   "Number is " + (isPalidrome(n) ? "palindrome" : "not palindrome")
    // );
    System.out.println("Sum of integer is " + sumNumber(n));
    sc.close();
  }

  public static int sumNumber(int n) {
    int sum = 0;

    while (n > 0) {
      int rem = n % 10;
      sum = sum + rem;
      n = n / 10;
    }
    return sum;
  }

  public static boolean isPalidrome(int n) {
    int rev = 0;
    int palidrome = n;
    while (n != 0) {
      int rem = n % 10;
      rev = rev * 10 + rem; //0,1
      n = n / 10;
    }
    System.out.println(rev);
    // System.out.println(palidrome);
    if (rev == palidrome) {
      return true;
    } else {
      return false;
    }
  }

  public static double average(double a, double b, double c) {
    return (a + b + c) / 3;
  }

  public static boolean isEven(int num) {
    return num % 2 == 0;
  }
}
