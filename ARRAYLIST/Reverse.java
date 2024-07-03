package ARRAYLIST;

import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(9);

        // rotated & sorted list
        // al.add(11);
        // al.add(15);
        // al.add(4);
        // al.add(5);
        // al.add(6);
        // al.add(9);

        System.out.println("original- " + al);

        // O(n)- linear timing to run the loop
        int j = 0;
        for (int i = al.size() - 1; i > 0; i--) {
            // System.out.print(al.get(i) + ", ");
            al.set(j, al.get(i)); // 0-9, 1-6,
            j++;
        }
        System.out.println("reversed: " + al);
    }
}
