package problem_2_Rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Rest {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] times = Arrays.stream(reader.readLine()
            .split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();

    int firstRestHour = times[0];
    int firstRestMinute = times[1];

    int firstRestAsMinutes = firstRestHour * 60 + firstRestMinute;

    int secondRestHour = times[2];
    int secondRestMinute = times[3];

    int secondRestAsMinutes = secondRestHour * 60 + secondRestMinute;

    int actualHour = times[4];
    int actualMinute = times[5];

    int actualAsMinutes = actualHour * 60 + actualMinute;

    boolean condition1 = Math.abs(firstRestAsMinutes - actualAsMinutes) - Math.abs(secondRestAsMinutes - actualAsMinutes) > 0;
    boolean condition2 = Math.abs(firstRestAsMinutes - actualAsMinutes) - Math.abs(secondRestAsMinutes - actualAsMinutes) < 0;

    if (condition1) {
      System.out.println(2);
      timeToPrint(secondRestAsMinutes, actualAsMinutes);
    } else if (condition2) {
      System.out.println(1);
      timeToPrint(firstRestAsMinutes, actualAsMinutes);
    } else {
      System.out.println(0);
      timeToPrint(secondRestAsMinutes, actualAsMinutes);
    }
  }

  private static void timeToPrint(int secondRestAsMinutes, int actualAsMinutes) {
    int timeToPrint = Math.abs(secondRestAsMinutes - actualAsMinutes);
    int hour = timeToPrint / 60;
    int minute = timeToPrint % 60;
    System.out.println(hour + " " + minute);
  }
}
