public class Main {

  public static void main(String[] args) {
    int[] heights = new int[]{3, 7, 3, 12, 7, 9, 16, 15, 12, 4, 6, 2};
    System.out.println(welcomeSign(heights));
  }

  public static int welcomeSign(int[] heights) {

    
    int largestArea = 0;

    for (int i = 0; i < heights.length; i++) {
      int height = heights[i];
      int width = 0;
      for (int j = i; j < heights.length; j++) {
        width = width + 10;
        if (heights[j] < height) {
          height = heights[j];
          
        }

        if ((height * width) > largestArea) {
            largestArea = height * width;
        }
      }
      
    }

    return largestArea;
    
  }

}