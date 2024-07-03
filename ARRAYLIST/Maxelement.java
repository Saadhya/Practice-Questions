package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class Maxelement {
    public static int maxElem(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        // int pos = 0;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(list.get(i), max);
            // pos = list.get(i);
        }
        // System.out.println("at position: " + i);
        return max;
    }

    // swap nums=  O(1)
    public static void swapNums(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(3);
        al.add(9);
        al.add(4);
        al.add(5);
        al.add(6);

        System.out.println("original list: " + al);
        System.out.println(maxElem(al));

        // swapping nums
        int idx1 = 1, idx2 = 3;
        swapNums(al, idx1, idx2);
        System.out.println("new list: " + al);

        // sorting using comparator:
        Collections.sort(al); //default ascending order
        System.out.println("Ascending order: "+al);

        // Descending- we can also modify comparator in reverseorder()
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Descending order: "+al);

    }
}
