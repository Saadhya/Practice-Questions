public class Operators {

  public static void main(String args[]) {
    int a = 10;
    int b = 5;
    int c = a + b;
    System.out.println("binary operators : " + c);
    // unary operators
    int i = a--;
    int j = ++b;
    // System.out.println("unary  a: " + a++); //9
    // System.out.println("unary  i: " + i); //10
    // System.out.println("unary  b: " + b); //6
    // System.out.println("unary  j: " + j); //6
    // System.out.println("unary  a: " + a); //6

    // logical operators
    // System.out.println("logical AND operator: " + ((3 > 2) && (5 < 0))); //true when both values are true
    // System.out.println("logical OR operator: " + ((3 < 2) || (5 > 0))); //true when any one value is true
    // System.out.println("logical NOT operator: " + !(3 < 2)); //convert the opposite logically

    int ab = 10;
    ab += 20; //30
    ab *= 2; //20
    System.out.println("assignment operator before divide: " + ab); //6
    ab %= 6; //10
    // ab /= 6; //10
    System.out.println("assignment operator ab: " + ab); //6
  }
}
