package problem_9_Max_Sum_Of_Subsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumOfSubsequence {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());

    int[] nums = new int[count];

    for (int i = 0; i < count; i++) {
      nums[i] = Integer.parseInt(reader.readLine());
    }

    int maxSum = Integer.MIN_VALUE;
    int endOfMaxSum = 0;

    for (int i = 0; i < nums.length; i++)
    {
      endOfMaxSum += nums[i];

      if (endOfMaxSum > maxSum){
        maxSum = endOfMaxSum;
      }

      if (endOfMaxSum < 0)
        endOfMaxSum = 0;
    }

    System.out.println(maxSum);
  }
}
