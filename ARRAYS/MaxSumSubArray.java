package ARRAYS;

public class MaxSumSubArray {

  // bruteforce approach
  public static void printSumArrays(int nums[]) {
    int nSize = nums.length;

    int max_sum = Integer.MIN_VALUE;

    for (int i = 0; i < nSize; i++) {
      for (int j = i; j < nSize; j++) {
        int curr_sum = 0;
        for (int k = i; k <= j; k++) {
          curr_sum += nums[k];
        }
        if (curr_sum > max_sum) {
          max_sum = curr_sum;
        }
        System.out.println(curr_sum);
      }
      System.out.println();
    }
    System.out.println("Max sum of subarray : " + max_sum);
  }

  //   prefix approach
  public static void prefixSumArrays(int nums[]) {
    int nSize = nums.length;
    int max_sum = Integer.MIN_VALUE;

    int prefix[] = new int[nSize];
    prefix[0] = nums[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + nums[i]; //0,1,2,3,4
    }
    for (int i = 0; i < nSize; i++) {
      for (int j = i; j < nSize; j++) {
        int curr_sum = 0;
        curr_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
        if (curr_sum > max_sum) {
          max_sum = curr_sum;
        }
      }
    }
    System.out.println("Max sum of subarray : " + max_sum);
  }

  //   kadane's approach
  public static void kadaneSumArrays(int nums[]) {
    int nSize = nums.length;
    int max_sum = Integer.MIN_VALUE;
    int curr_sum = 0;

    for (int i = 0; i < nSize; i++) {
      curr_sum = curr_sum + nums[i];
      if (curr_sum < 0) {
        curr_sum = 0;
      }
      max_sum = Math.max(max_sum, curr_sum);
    }
    System.out.println("Max sum of subarray : " + max_sum);
  }

  //   kadane's approach for all negative values
  public static void kadaneNSum(int nums[]) {
    int nSize = nums.length;
    int max_sum = Integer.MIN_VALUE;
    int curr_sum = 0;

    for (int i = 0; i < nSize; i++) {
      // if (nums[i] < 0) {
      //   max_sum = Math.max(max_sum, nums[i]);
      // } else {
      curr_sum = curr_sum + nums[i];
      max_sum = Math.max(max_sum, curr_sum);
      //   System.out.println(curr_sum);
    }
    // System.out.println(max_sum);
    if (max_sum < 0) {
      for (int i = 0; i < nSize; i++) {
        max_sum = Math.max(max_sum, nums[i]);
      }
    }
    System.out.println("Max sum of subarray with -ve approach: " + max_sum);
  }

  public static void javaMathFuncs(int a, int b) {
    // https://www.javatpoint.com/java-math

    System.out.println("Maximum number of x and y is: " + Math.max(a, b));
    System.out.println("minimum number of x and y is: " + Math.min(a, b));

    System.out.println("sqrt: " + Math.sqrt(a));
    System.out.println("power of x and y " + Math.pow(5, 3));

    // return the logarithm of given value
    System.out.println("log value of a :" + Math.log(a));
    System.out.println("log value of b :" + Math.log(b));

    // return the logarithm of given value when base is 10
    System.out.println("log base 10 of a " + Math.log10(a));
    System.out.println("log base 10 of b " + Math.log10(b));

    // return the log of x + 1
    System.out.println("log1p of a is: " + Math.log1p(a));

    // return a power of 2
    System.out.println("exp of a is: " + Math.exp(a));

    // return (a power of 2)-1
    System.out.println("expm1 of a is: " + Math.expm1(a));
  }

  public static void trignoMathFuns(double n) {
    System.out.println("sine val " + Math.sin(n));
    System.out.println("cos val " + Math.cos(n));
    System.out.println("tan " + Math.tan(n));
    System.out.println("tan h " + Math.tanh(n));

    // return the trigonometric arc sine of a
    System.out.println("Sine value of a is: " + Math.asin(n));

    // return the trigonometric arc cosine value of a
    System.out.println("Cosine value of a is: " + Math.acos(n));

    // return the trigonometric arc tangent value of a
    System.out.println("Tangent value of a is: " + Math.atan(n));

    // return the hyperbolic sine of a
    System.out.println("Sine value of a is: " + Math.sinh(n));

    // return the hyperbolic cosine value of a
    System.out.println("Cosine value of a is: " + Math.cosh(n));
  }

  public static void main(String[] args) {
    int nums[] = { 1, 2, 5, 6, 7 };
    // int nums[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
    int numsn[] = { -8, -22, -5, -4 };
    printSumArrays(nums);
    // prefixSumArrays(nums);
    // kadaneSumArrays(nums);
    kadaneNSum(numsn);
    double a = 30;
    // javaMathFuncs(50, 6);
    trignoMathFuns(a);
  }
}
