package ARRAYS;

public class TrappingWater {

  public static int trapRainWater(int barHeights[]) {
    int wl, width = 1, trappedWater = 0;
    int barlength = barHeights.length;

    // calculate left max boundary
    int maxleft[] = new int[barlength];
    maxleft[0] = barHeights[0];
    for (int i = 1; i < barlength; i++) {
      maxleft[i] = Math.max(barHeights[i], maxleft[i - 1]);
      System.out.print(maxleft[i]);
    }
    System.out.println();

    // calculate right max boundary
    int maxright[] = new int[barlength];
    maxright[barlength - 1] = barHeights[barlength - 1];
    int k = 0;
    for (int i = barlength - 2; i >= 0; i--) {
      maxright[i] = Math.max(barHeights[i], maxright[i + 1]);
      System.out.print(maxright[k]);
      k++;
    }
    System.out.println();

    // loop
    for (int i = 0; i < barlength; i++) {
      wl = Math.min(maxleft[i], maxright[i]);
      //   trapped-water= wl-barheight* width
      trappedWater += (wl - barHeights[i]) * width;
    }
    return trappedWater;
  }

  public static void main(String[] args) {
    int heights[] = { 4, 2, 0, 6, 3, 2, 5 };
    int totalWater = trapRainWater(heights);
    System.out.println("trapped water: " + totalWater);
  }
}
