package ARRAYS;

public class RemoveDuplicate {
    public static void removeDup(int nums[]) {
        int newnum[] = {};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // newnum[i] = i;
            if (nums[i] == nums[i + 1]) {
                count++;
                newnum[i] = i;
            }
        }
        System.out.println(count);
        // for (int i = 0; i < newnum.length; i++) {
        //     System.out.println(newnum[i]);
        // }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 1, 2, 2, 3 };
        removeDup(arr);
    }
}
