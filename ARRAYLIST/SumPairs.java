package ARRAYLIST;

import java.util.ArrayList;

public class SumPairs {
    // pair sum 2
    public static boolean pairSumRotated(ArrayList<Integer> al, int target) {
        // optimistic approach for sorted array
        int bp = -1;

        // to find pivot element= break point
        for (int i = 0; i < al.size(); i++) {
            // System.out.println(i+1);
            if (al.get(i) > al.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;// smallest
        int rp = bp;// largest
        while (lp != rp) {
            if (al.get(lp) + al.get(rp) < target) {
                lp = (lp + 1) % al.size();
            } else if (al.get(lp) + al.get(rp) > target) {
                rp = (al.size() + rp - 1) % al.size();
            } else {
                System.out.println("pair for target " + target + " exist at (" + lp + " " + rp + ") ");
                return true;
            }
        }

        return false;
    }

    public static boolean pairSum1(ArrayList<Integer> al, int target) {
        // optimistic approach for sorted array
        int lp = 0;
        int rp = al.size() - 1;
        while (lp != rp) {
            int sum = al.get(lp) + al.get(rp);
            if (sum == target) {
                System.out.println("pair exist at (" + lp + " " + rp + ") ");
                return true;
            } else if (sum < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    // bruteforce approach
    public static ArrayList<Integer> pairSumSorted(ArrayList<Integer> al, int target) {
        ArrayList<Integer> newlist = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {// 0
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i) + al.get(j) == target) {
                    newlist.add(i);
                    newlist.add(i + 1);
                    return newlist;
                }
            }
        }

        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        // al.add(2);
        // al.add(3);
        // al.add(4);
        // al.add(5);
        // al.add(6);
        // al.add(9);
        // System.out.println("pair sum exist: " + pairSum1(al, 5));
        // System.out.println("pair sum exist: " + pairSumSorted(al, 5));

        // rotated & sorted list
        al.add(11);
        al.add(15);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(9);
        System.out.println(pairSumRotated(al, 16));
    }
}
