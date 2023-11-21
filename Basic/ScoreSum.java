import java.util.Scanner;

public class ScoreSum {

  public static void main(String[] args) {
    // print even from 9= 100
    int start = 10;
    int last = 98;
    while (start <= last) {
      System.out.print(start + ", ");
      start += 2;
    }
    System.out.println("starting : " + start);
    // int sum = 0;
    // int count = 0;
    // System.out.println("Enter your score");
    // Scanner sc = new Scanner(System.in);
    // while (count < 25) {
    //   int score = sc.nextInt(); //true condition
    //   sum = sum + score;
    //   count += 1;
    // }
    // System.out.println(sum); //false condition
    // int avg = sum / 25;
    // System.out.println("Average: " + avg);
  }
}
