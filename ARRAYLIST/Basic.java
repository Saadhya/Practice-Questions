package ARRAYLIST;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        // ops
        ArrayList<Integer> al = new ArrayList<>();
        // add- O(1);
        al.add(2);
        al.add(1);
        al.add(3);
        al.add(4);
        al.add(5);

        // get - O(1);
        al.get(3);
        // remove- O(n) (bcz its iterating the whole list to find the particular index )
        al.remove(2);

        // set element at index- O(n)
        al.set(2, 10);

        System.out.println(al);

        // contains element- O(n)
        System.out.println(al.contains(11));

        // this add() will have O(n) TC, due to search and add value to the index
        al.add(3,14);
    }

}