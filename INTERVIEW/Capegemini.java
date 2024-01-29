package INTERVIEW;
import java.util.*;

public class Capegemini {

  public static void printPrimes() {
    int num = 0;
    String primeNumbers = "";
    for (int i = 1; i < 100; i++) {
      int counter = 0;
      for (num = i; num >= 1; num--) {
        if (i % num == 0) {
          counter = counter + 1;
        }
      }
      if (counter == 2) {
        //Appended the Prime number to the String
        primeNumbers = primeNumbers + i + " ";
      }
    }
    System.out.print(primeNumbers + " ");
  }

  public static void findMax() {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(5);
    al.add(3);
    al.add(6);
    al.add(7);
    al.add(98);
    al.add(98);

    int maxNum = 0;
    //  System.out.println(maxNum);
    for (int i = 0; i < al.size(); i++) {
      maxNum = Math.max(al.get(i), maxNum);
    }
    System.out.println("Maximum num " + maxNum);
  }

  public static void main(String args[]) {
    findMax();
    printPrimes();
  }
}
