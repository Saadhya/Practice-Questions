package ARRAYLIST;

import java.util.ArrayList;

public class MaxStoreWater {
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        // 2pointer approach
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // System.out.println(maxWater);

            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }

        // brute force= O(n^2)
        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i + 1; j < height.size(); j++) {
        // int ht = Math.min(height.get(i), height.get(j));
        // int width = j - i;
        // int currWater = ht * width;
        // maxWater = Math.max(maxWater, currWater);
        // }
        // }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        int nums[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        for (int i : nums) {
            al.add(i);
        }
        System.out.println("help me please");
        System.out.println(storeWater(al));
    }
}
