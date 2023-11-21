import java.util.Scanner;

public class FuncBasics {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println("sum is : " + calculatesum(a, b));
    // System.out.println("Product is : " + multiply(a, b));
    // System.out.println("Product is : " + multiply(15, 20));
    System.out.println("Factorial is : " + factorial(7)); //120
  }

  public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static int multiply(int a, int b) {
    return a * b;
  }

  // such functions conventionally called methods, due to creating inside a class
  public static void printhelo() {
    System.out.println("Hello world");
  }

  public static int calculatesum(int a, int b) {
    int sum = a + b;
    return sum;
  }
}
