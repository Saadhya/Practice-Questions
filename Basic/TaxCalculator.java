import java.util.*;

public class TaxCalculator {

  public static void main(String args[]) {
    System.out.println("Income tax calculator");
    Scanner sc = new Scanner(System.in);
    // int income = sc.nextInt();
    // double tax;
    // if (income < 500000) {
    //   tax = 0;
    // } else if (income < 1000000 && income >= 500000) {
    //   tax = income * 0.2;
    // } else {
    //   tax = income * 0.3;
    // }
    // System.out.println("tax: " + tax);

    // example 2
    // int a = 1, b = 3, c = 5;
    // if ((a >= b) && (a >= c)) {
    //   System.out.println("largest: " + a);
    // } else if (b >= c) {
    //   System.out.println("largest: " + b);
    // } else {
    //   System.out.println("largest: " + c);
    // }

    // example 3
    int number = 4;
    String type = ((number % 2) == 0) ? "even" : "odd";
    System.out.println(type);

    int marks = sc.nextInt();
    String status = marks >= 33 ? "pass" : "fail";
    System.out.println(status);
  }
}
