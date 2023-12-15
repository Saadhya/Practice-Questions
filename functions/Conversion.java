public class Conversion {

  public static void main(String[] args) {
    bintoDec(101);
    decToBin(15);
  }

  public static void bintoDec(int n) {
    int dec = 0;
    int pow = 0;

    while (n > 0) {
      int lastdigit = n % 10;
      dec = dec + (lastdigit * (int) Math.pow(2, pow));
      pow++;
      // System.out.println(dec);
      n = n / 10;
    }
    System.out.println(dec);
  }

  public static void decToBin(int n) {
    int binNum = 0;
    int pow = 0;
    while (n > 0) {
      int lastdigit = n % 2;
      binNum = binNum + (lastdigit * (int) Math.pow(10, pow));
      System.out.println(Math.pow(10, pow));
      pow++;
      n = n / 2;
    }
    System.out.println(binNum);
  }
}
