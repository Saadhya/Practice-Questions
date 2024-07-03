package ARRAYS;

import java.util.Arrays;
import java.util.Iterator;

public class PairSum {
    // brute force approach
    public static int[] twoSum(int[] nums, int target) {
        int sums[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    sums[0] = i;
                    sums[1] = j;
                    return sums;
                }
            }
        }
        System.out.println(sums);
        return sums;
    }

    // 2 pointer approach- optmistic approach
    public static int[] twoSumPointer(int[] nums, int target) {
        int bp = 0;
        for (int i = 0; i < nums.length; i++) {
            // System.out.println(i+1-1);
            if (nums[i] > nums[i + 1]) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1;
        int rp = bp;
        int sums[] = new int[2];
        while (lp != rp) {
            if (nums[lp] + nums[rp] == target) {
                sums[0] = lp;
                sums[1] = rp;
                return sums;
            } else if (nums[lp] + nums[rp] < target) {
                lp = (lp + 1) % nums.length;
            } else {
                rp = (nums.length + rp - 1) % nums.length;
            }
        }
        return sums;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;

        System.out.println("pair sum: " + Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSumPointer(nums, target)));

        // ALL TYPE OF ARRAY PRINTING METHODs
        // Arrays.stream(twoSum(nums, target)).forEach(System.out::println);
        // Iterator<Integer> it=Arrays.stream(twoSum(nums, target)).iterator();
        // System.out.println(it.next());
        // System.out.println(it.next());

        // declaration and initialization of two dimensional array of float type
        // float[][] array = { { 1.2f, 2.5f }, { 3.9f, 4.0f }, { 5.3f, 6.2f } };
        // System.out.println(Arrays.deepToString(array));

        // String[] stringArray = { "Hello", "Java", "Programmers" };
        // System.out.println(Arrays.asList(stringArray));
        // System.out.println(Arrays.deepToString(stringArray));

    }

}
