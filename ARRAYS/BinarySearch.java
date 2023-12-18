package ARRAYS;

public class BinarySearch {

  public static int binarySearch(int key, int nums[]) {
    int start = 0, end = nums.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (key == nums[mid]) {
        return mid;
      } else if (key > nums[mid]) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;
  }

  public static void reverseArr(int nums[]) {
    int start = 0, end = nums.length - 1;
    int third;
    while (start < end) {
      third = nums[start];
      nums[start] = nums[end];
      nums[end] = third;

      start++;
      end--;
    }
  }

  public static void pairs(int nums[]) {
    int tp = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        System.out.print("( " + nums[i] + ", " + nums[j] + " )");
        tp++;
      }
      System.out.println();
    }
    System.out.println("total pairs: " + tp);
  }

  public static void printSubArrays(int nums[]) {
    int tarrays = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        for (int k = i; k <= j; k++) {
          System.out.print(nums[k] + " ");
        }
        tarrays++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println("total subarrays: " + tarrays);
  }

  public static void main(String[] args) {
    int nums[] = { 2, 4, 6, 8, 10 };
    printSubArrays(nums);
    // int key = 28;
    // int index = binarySearch(key, nums);
    // if (index == -1) {
    //   System.out.println(key + " not found");
    // } else {
    //   System.out.println("index of binary search: " + index);
    // }

    // reverseArr(nums);
    // for (int i : nums) System.out.print(i + ", "); //SC=O(1) & TC=O(n)

    // pairs(nums);

  }
}
