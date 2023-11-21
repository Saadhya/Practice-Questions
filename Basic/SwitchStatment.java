import java.util.Scanner;

public class SwitchStatment {

  public static void main(String args[]) {
    // Switch statements
    // int number = 4;
    // switch (number) {
    //   case 1:
    //     System.out.println("samosa");
    //   case 2:
    //     System.out.println("chowmin");
    //   case 3:
    //     System.out.println("chilli chicken");
    //   default:
    //     System.out.println("we woke up");
    // }

    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a : ");
    // int a = sc.nextInt();
    // System.out.println("Enter b : ");
    // int b = sc.nextInt();
    // System.out.println("Enter operator : ");
    // char operator = sc.next().charAt(0);
    // switch (operator) {
    //   case '+':
    //     System.out.println(a + b);
    //     break;
    //   case '-':
    //     System.out.println(a - b);
    //     break;
    //   case '*':
    //     System.out.println(a * b);
    //     break;
    //   case '/':
    //     System.out.println(a / b);
    //     break;
    //   case '%':
    //     System.out.println(a % b);
    //     break;
    //   default:
    //     System.out.println("Please enter valid operation");
    // }

    System.out.println("Please enter day number");
    char day = sc.next().charAt(0);
    switch (day) {
      case '1':
        System.out.println("Sunday");
        break;
      case '2':
        System.out.println("Monday");
        break;
      case '3':
        System.out.println("Tueday");
        break;
      case '4':
        System.out.println("Wednesday");
        break;
      case '5':
        System.out.println("Thursday");
        break;
      case '6':
        System.out.println("Friday");
        break;
      case '7':
        System.out.println("Saturday");
        break;
      default:
        System.out.println("Please enter valid number");
    }
  }
}
