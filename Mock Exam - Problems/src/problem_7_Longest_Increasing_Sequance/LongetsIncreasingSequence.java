package problem_7_Longest_Increasing_Sequance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongetsIncreasingSequence {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int maxCount = 1;
    int currentCount = 1;

    int count = Integer.parseInt(reader.readLine());

    int previousNum = Integer.parseInt(reader.readLine());

    for (int i = 1; i < count; i++) {
      int nextNum = Integer.parseInt(reader.readLine());

      if (nextNum > previousNum) {
        currentCount++;
        previousNum = nextNum;

        if (currentCount > maxCount) {
          maxCount = currentCount;
        }
      } else {
        currentCount = 1;
        previousNum = nextNum;
      }
    }

    System.out.println(maxCount);
  }
}
