import java.util.Scanner;

public class FuncOverloading {

  public static void main(String[] args) {
    // System.out.println(sum(8, 9));
    // System.out.println(sum(3.2f, 5.2f));
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(isPrime(n)); // not prime
    sc.close();
    // System.out.println(isPrime(7)); // prime
  }

  public static void primesInRange(int n) {
    for (int i = 1; i <= n; i++) {
      isPrime(i);
    }
  }

  // approache 2
  public static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

  // less optimized code - approache 1
  // public static boolean isPrime(int n) {
  //   // corner cases
  //   // 1
  //   if (n == 2) {
  //          return "is prime";
  //   }
  //   // raw code - approache 1
  //   for (int i = 2; i <= n - 1; i++) {
  //     if (n % i == 0) {
  //      return "not prime";
  //       // break; //as we are only for once dividing
  //     }
  //   }
  //    return "is prime";
  // }

  // using data type
  public static float sum(float a, float b) {
    return a + b;
  }

  // using parameters
  public static int sum(int a, int b) {
    return a + b;
  }
  // public static int sum(int a, int b, int c) {
  // return a + b + c;
  // }

}
