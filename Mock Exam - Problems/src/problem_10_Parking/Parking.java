package problem_10_Parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Parking {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());

    int[] nums;
    int maxSum = 0;

    nums = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    int sum = Arrays.stream(nums).sum();

    for (int i = 0; i < nums.length; i++) {
      int currentSum = 0;
      for (int j = i; j < nums.length; j++) {
        if (nums[i] == nums[j]){
          currentSum+= nums[i];
        } else {
          continue;
        }
      }

      if (currentSum > maxSum){
        maxSum = currentSum;
      }
    }

    System.out.println(sum - maxSum);
  }
}
