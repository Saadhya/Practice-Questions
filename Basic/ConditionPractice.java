import java.util.Scanner;

public class ConditionPractice {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number");
    // int n = sc.nextInt();
    // String res = n < 0 ? "Negative" : "Positive";
    // System.out.println(res);

    // double temp = 103.5;
    // if (temp > 100) System.out.println(
    //   "You have a fever"
    // ); else System.out.println("You don't have fever");

    // int a = 63, b = 36;
    // boolean x = (a < b) ? true : false;
    // System.out.println(x);
    // else if (year % 100 != 0) {
    //     System.out.println("Leap year");
    //   }

    System.out.println("Enter a  year");
    int year = sc.nextInt();
    if (year % 4 == 0) {
      System.out.println("Leap year");
    } else if (year % 100 == 0) {
      if (year % 400 == 0) {
        System.out.println("Leap year");
      }
    } else {
      System.out.println("not a Leap year");
    }
  }
}
