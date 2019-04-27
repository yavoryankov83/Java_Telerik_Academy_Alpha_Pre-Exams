package problem_5_Sum_Two_Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTwoNumbers {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int num_1 = Integer.parseInt(reader.readLine());
    int num_2 = Integer.parseInt(reader.readLine());

    int sum = num_1 + num_2;

    System.out.println(sum);
  }
}
