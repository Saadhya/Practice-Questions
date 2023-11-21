public class binarySearch {

  public static int bs(int number[], int key) {
    System.out.println("binary search");
    int start = 0, end = number.length - 1;
    while (start < end) {
      int mid = (start + end) / 2;
      if (number[mid] == key) {
        return mid;
      } else if (number[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    System.out.println(start);
    return -1;
  }

  public static void main(String[] args) {
    // int n = 0;
    // System.out.println(n++);
    // System.out.println(n++);

    int key = 11;
    int num[] = { 2, 4, 6, 8, 10, 12, 14 };
    System.out.println("index of key " + bs(num, key));
  }
}
