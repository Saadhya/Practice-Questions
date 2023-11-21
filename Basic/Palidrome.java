public class Palidrome {

  public static void main(String args[]) {
    int n = 10899;
    int rem;
    int rev = 0;
    while (n > 0) {
      rem = n % 10;
      rev = rev * 10 + rem;
      n = n / 10;
    }
    System.out.println(rev);

    // break statement use
    for (int i = 0; i < 5; i++) {
      if (i == 3) {
        break;
      }
      System.out.println(i);
    }
  }
}
