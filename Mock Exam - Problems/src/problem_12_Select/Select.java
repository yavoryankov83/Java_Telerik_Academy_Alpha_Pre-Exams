package problem_12_Select;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Select {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] pair = Arrays
            .stream(reader.readLine()
                    .split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();

    int[] nums = Arrays
            .stream(reader.readLine()
                    .split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();

    int count = pair[1];
    int maxCount = 0;

    for (int i = 0; i < nums.length; i++) {
      int currentCount = 0;
      for (int j = i; j < count; j++) {
        if (isPrime(nums[j])) {
          currentCount++;
        } else {
          continue;
        }
      }

      if (currentCount > maxCount) {
        maxCount = currentCount;
      }
    }

    System.out.println(maxCount);
  }

  private static boolean isPrime(int num) {
    for (int i = 2; i <= num / 2; i++) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}
