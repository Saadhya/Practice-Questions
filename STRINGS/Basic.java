package STRINGS;

import java.util.Scanner;

public class Basic {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();

        System.out.println(name);
        sc.close();
        // length of string
        System.out.println(name.length());

        // concatenation
        String fname = "Tony";
        String lname = "Stark";
        String fullName = fname + " " + lname;
        System.out.println(fullName);
        printLetters(fullName);
    }
}
