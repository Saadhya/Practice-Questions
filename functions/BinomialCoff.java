public class BinomialCoff {

  public static void main(String[] str) {
    System.out.println(binomialcoff(5, 3));
  }

  public static  int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static int binomialcoff(int n, int r) {
    int nfact = factorial(n);
    int rfact = factorial(r);
    int nmrfact = factorial(n - r);
    int bc = nfact / (rfact * nmrfact);
    return bc;
  }
}
