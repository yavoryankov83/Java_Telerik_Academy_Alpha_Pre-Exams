package balanced_Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedNumbers {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int inputNumber;
    int sum = 0;

    while (isBalancedNumber(inputNumber = Integer.parseInt(reader.readLine()))) {
      sum += inputNumber;
    }

    System.out.println(sum);
  }

  public static boolean isBalancedNumber(int number) {
    int firstDigit = number / 100;
    int secondDigit = (number / 10) % 10;
    int thirdDigit = number % 10;

    return secondDigit == firstDigit + thirdDigit;
  }
}
