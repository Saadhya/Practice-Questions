public class MergeSort {

  public static void main(String[] args) {
    int arr[] = { 3, 6, 9, 5, 2, 8 };
    mergeSort(arr, 0, arr.length - 1);
  }

  public static void mergeSort(int arr[], int si, int ei) {
    if (si > ei) {
      return;
    }
    int mid = si + (ei - si) / 2;
    mergeSort(arr, si, ei); //left part
    mergeSort(arr, mid + 1, ei); //right part
    merge(arr, si, ei, mid);
  }

  public static void merge(int arr[], int si, int ei, int mid) {}
}
