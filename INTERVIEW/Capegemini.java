package INTERVIEW;

import java.util.*;

public class Capegemini {

  public static boolean isPrime(int n) {
    for (int i = 2; i <= n - 1; i++) {
      if (n % i == 0) {
        return false; //not prime
      }
    }
    return true; //prime num
  }

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
    // ArrayList<Integer> al = new ArrayList<Integer>();
    // al.add(5);
    // al.add(98);
    // al.add(98);
    List<Integer> al = Arrays.asList(5, 3, 2, 4, 6, 8, 7, 90, 98);

    int maxNum = 0;
    //  System.out.println(maxNum);
    for (int i = 0; i < al.size(); i++) {
      maxNum = Math.max(al.get(i), maxNum);
    }
    System.out.println("Maximum num " + maxNum);
  }

  public static void main(String args[]) {
    System.out.println(isPrime(16) ? "not a prime " : "is a prime");
    findMax();
    printPrimes();
  }
}

// second dary interview
// class Employee{

//   name
//   salary
//   department
  
//   =>print details in asc ordder based on salary
  
//   public function (){
//   int sal = 0;
//   employees=[]
//   var = employees.stream().map(x-> x.salary).collect(Collectors.toList())
//   employees.stream().filter(x-> x.salary>50000).forEach(y-> syout(y))
//   }
  
  
  