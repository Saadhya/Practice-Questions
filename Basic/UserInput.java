import java.util.Scanner;

public class UserInput {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // type promotion in expression - only allowed for shot, byte, char to int only
    // short a = 5;
    // byte b = 25;
    // char c = 'c';
    // byte sum = (byte) (a + b + c);
    // System.out.println(sum);
    // char a = 'a';
    // char b = 'b';
    // // char c = b - a; //promotion not allowed in expression inside a variable
    // // System.out.println((int) b);
    // // System.out.println((int) a);
    // System.out.println(b - a);

    // float marks = 99.999f;
    // int b = (int) marks; //typecasting
    // System.out.println(b);
    // type promotion in expression - only allowed for shot, byte, char to int only

    // float rad = sc.nextFloat();
    // float area = 3.14f * rad * rad;
    // System.out.println(area);

    // String input = sc.next(); //only for one word before space
    // String input = sc.nextLine();
    // System.out.println(input);

    // int num = sc.nextInt();
    // System.out.println(num);

    // boolean first = sc.nextBoolean();
    // System.out.println(first);

    // short sec = sc.nextShort();
    // System.out.println(sec);

    // long key = sc.nextLong();
    // System.out.println(key);

    // double inp1 = sc.nextDouble();
    // double inp2 = sc.nextDouble();
    // System.out.println("sum: " + (inp1 + inp2));
    // System.out.println("product: " + (inp1 * inp2));
    sc.close();
  }
}
