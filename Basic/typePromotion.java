import java.util.Scanner;

public class typePromotion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // wrong inputs can be due to type-promotion
    byte b = 5;
    // b = (byte) b * 2; //wrong one
    b = (byte) (b * 2);

    System.out.println(b);
    //
    // 2nd type promotion in java
    // int a = 10;
    // float b = 2.5f;
    // char c = 'g';
    // double d = 2323;
    // // int sum = a + b + c + d; //won't work due to lossy conversion from double to int
    // double sum = a + b + c + d; //will work
    // System.out.println(a + b + c); //here float is largest type
    // System.out.println(sum); //here double is largest type, so all will be promoted to double.
    //
    // type promotion in expression - only allowed for shot, byte, char to int only
    // short a = 5;
    // byte b = 25;
    // char c = 'c';
    // byte sum = (byte) (a + b + c);
    // System.out.println(sum);
  }
}
