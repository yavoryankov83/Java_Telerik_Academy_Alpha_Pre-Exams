package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int number = Integer.parseInt(reader.readLine());

    int firstDigit = number / 100;
    int secondDigit = number / 10 % 10;
    int thirdDigit = number % 10;

    int maxResult = firstDigit + secondDigit + thirdDigit;

    maxResult = Math.max(maxResult, (firstDigit * secondDigit * thirdDigit));
    maxResult = Math.max(maxResult, (firstDigit * secondDigit + thirdDigit));
    maxResult = Math.max(maxResult, (firstDigit + secondDigit * thirdDigit));

    System.out.println(maxResult);
  }
}
