package problem_3_Lift;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lift {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double[] input = Arrays.stream(reader.readLine()
            .split("\\s+"))
            .mapToDouble(Double::parseDouble)
            .toArray();

    int[] coupons = Arrays.stream(reader.readLine()
            .split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();

    double maxCount = Math.max(input[2], input[3]);
    double minCount = Math.min(input[2], input[3]);

    int firstGroupCount = (int) (input[0] / maxCount);
    double firstGroupParticipants = firstGroupCount * maxCount;

    int secondGroupCount = (int) ((input[0] - firstGroupParticipants) / minCount);
    double secondGroupParticipants = secondGroupCount * minCount;

    double budget = input[0] * input[1];

    budget = getBudget(input, firstGroupParticipants, budget);

    budget = getBudget(input, secondGroupParticipants, budget);

    System.out.println(budget);
    double maxCoupon = Math.max(coupons[0], coupons[1]);
    double minCoupon = Math.min(coupons[0], coupons[1]);

    int firstCouponCount = (int) (budget / maxCoupon);
    double addition = (budget - maxCoupon * firstCouponCount);
    int secondCouponCount = (int) (addition / minCoupon);

    double addition2 = addition - secondCouponCount * minCoupon;

    int thirdCouponCount = (int) (addition2 / 1);

    if (addition2 % 1 != 0) {
      thirdCouponCount++;
    }

    System.out.println(firstCouponCount + " " + secondCouponCount + " " + thirdCouponCount);
  }

  private static double getBudget(double[] input, double firstGroupParticipants, double budget) {
    if (firstGroupParticipants > input[3]) {
      double bonus = (firstGroupParticipants * input[1]) * 0.2;
      budget -= bonus;
    } else if (firstGroupParticipants > input[2]) {
      double bonus = (firstGroupParticipants * input[1]) * 0.1;
      budget -= bonus;
    }
    return budget;
  }
}
