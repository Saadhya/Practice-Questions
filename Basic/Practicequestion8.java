import java.util.Scanner;

public class Practicequestion8 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // question 4 :
    byte b = 4;
    char c = 'c';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;
    double result = (f * b) + (i % c) - (d * 5);
    System.out.println(result);

    // question 3
    // float pencil = sc.nextFloat();
    // float pen = sc.nextFloat();
    // float eraser = sc.nextFloat();
    // float bill = pencil + pen + eraser;
    // System.out.println(bill);
    // float gst = bill * 18 / 100;
    // System.out.println("gst: " + gst);
    // System.out.println("Total bill: " + (gst + bill));

    // question 2:;
    // int side = sc.nextInt();
    // int area = side * side;
    // System.out.println(area);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();
    // int avg = (a + b + c) / 3;
    // System.out.println("sum: " + avg);

    // question :
    // int $ = 24;
    // System.out.println($);
    sc.close();
  }
}
