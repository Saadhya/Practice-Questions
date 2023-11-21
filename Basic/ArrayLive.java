public class ArrayLive {

  public static void main(String args[]) {
    int counter = 1;
    int arr[] = new int[5];
    System.out.println(arr);
    System.out.println(arr.length);

    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;

    int ans = -1;
    int start = 0;
    int end = n - 1;
    int target = 16;
    int arrr[] = { 3, 9, 11, 14, 16, 19 };
    int n = arrr.length;

    while (start <= end) { //log2(n)
      int mid = (start + end) / 2;
      if (arr[mid] == tar) {
        ans = mid;
        break;
      } else if (arr[mid] < tar) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
  }
}
