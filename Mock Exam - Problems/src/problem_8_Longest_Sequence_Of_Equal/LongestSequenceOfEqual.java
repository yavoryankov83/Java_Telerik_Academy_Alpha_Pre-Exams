package problem_8_Longest_Sequence_Of_Equal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSequenceOfEqual {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int maxCount = 1;
    int currentCount = 1;

    int count = Integer.parseInt(reader.readLine());

    int prevNum = Integer.parseInt(reader.readLine());

    for (int i = 1; i < count; i++) {
      int nextNum = Integer.parseInt(reader.readLine());

      if (nextNum == prevNum) {
        currentCount++;
        prevNum = nextNum;

        if (currentCount > maxCount) {
          maxCount = currentCount;
        }
      } else {
        currentCount = 1;
        prevNum = nextNum;
      }
    }

    System.out.println(maxCount);
  }
}
