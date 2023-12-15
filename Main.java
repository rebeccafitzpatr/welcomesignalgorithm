import java.util.HashMap;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
    int[] heights = new int[]{3, 7, 3, 12, 7, 9, 16, 15, 12, 4, 6, 2};
    System.out.println(welcomeSign(heights));

  }

  public static int welcomeSign(int[] heights) {

    HashMap<Integer, Integer> records = new HashMap<Integer, Integer>();
    int largestArea = 0;
    int shortest = heights[0];
    records.put((heights[0]), 1);
    int check = shortest;
    int block = 0;
    int prev = 0;
    

    for (int i = 0; i < heights.length; i++) {
      int height = heights[i];

      if (height < shortest) {
       records.put((height), i);
       shortest = height;
      } else if (height > prev) {
        int shortestBlock = records.get(shortest) + 1;
        records.clear();
        records.put(prev, 2);
        records.put(height, 1);
        records.put(shortest,(shortestBlock));

      }

      for (int key : records.keySet()) {
        if (key * records.get(key) > largestArea) {
          largestArea = key * records.get(key);
        }
      }
      
    }

    return largestArea;
    
  }

}