package problem_13_Go_Forward;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoForward {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] nums = Arrays
            .stream(reader.readLine()
                    .split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();

    int childrenCount = nums[0];
    int lastNumber = nums[1];

    for (int i = 0; i < childrenCount - 1; i++) {
      lastNumber /= 2;
    }

    System.out.println(lastNumber);
  }
}
