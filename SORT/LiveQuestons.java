public class LiveQuestons {

  public static void main(String[] args) {
    // String arr = { "p", "q", "r", "b", "a", "c" };
    int arr = { 2, 6, 4, 3, 1, 5 };
    mergeSort(arr, 0, arr.length - 1);
  }

  //   public static void mergeSort(String[] arr, int si, int ei) {
  //     if (si >= ei) {
  //       return;
  //     }
  //     int mid = si + (ei = si) / 2;
  //     mergeSort(arr, si, ei); //left
  //     mergeSort(arr, mid + 1, ei); //right
  //   }

  //   public static void merge() {
  //     int p1, p2, p3;
  //   }

  public static int mergeSort(int[] arr, int si, int ei) {
    if (si >= ei) {
      return 0;
    }
    int ans = 0;
    int mid = si + (ei = si) / 2;
    ans += mergeSort(arr, si, ei); //left
    ans += mergeSort(arr, mid + 1, ei); //right

    ans += merge(arr, si, mid, ei);
  }
}
