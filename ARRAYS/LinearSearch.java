package ARRAYS;

public class LinearSearch {

  public static int linearSearch(int key, int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void getLargest(int nums[]) {
    int largest = Integer.MIN_VALUE; //-infinity
    int smallest = Integer.MAX_VALUE; //+infinity

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > largest) {
        largest = nums[i];
      }
      if (nums[i] < smallest) {
        smallest = nums[i];
      }
    }
    System.out.println("largest value: " + largest);
    System.out.println("smallest value: " + smallest);
  }

  public static void main(String[] args) {
    int arr[] = { 5, 4, 8, 9, 6, 2, 3 };

    getLargest(arr);
    // int index = linearSearch(9, arr);
    // for (int i = 0; i < arr.length; i++) {
    //   System.out.print(arr[i] + ", ");
    // }
    // System.out.println();
    // if (index == -1) {
    //   System.out.println("this is not right index");
    // } else {
    //   System.out.println("9 is at: " + index);
    // }
  }
}
