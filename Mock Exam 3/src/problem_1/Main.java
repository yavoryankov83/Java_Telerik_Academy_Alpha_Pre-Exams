package problem_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int lenght = Integer.parseInt(reader.readLine());

    int[] nums = Arrays.stream(reader.readLine()
            .split(","))
            .mapToInt(Integer::parseInt)
            .toArray();

    int[] falseResult = new int[2];

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == nums[nums.length - lenght + i]) {
        if (i == lenght - 1) {
          System.out.print("true ");
          for (int j = 0; j < lenght; j++) {
            if (j == lenght - 1) {
              System.out.print(nums[j]);
            } else {
              System.out.print(nums[j] + ",");
            }
          }
          break;
        }
      } else {
        falseResult[0] = nums[i];
        falseResult[1] = nums[nums.length - lenght + i];
        System.out.print(String.format("false %d,%d", falseResult[0], falseResult[1]));
        return;
      }
    }
  }
}
