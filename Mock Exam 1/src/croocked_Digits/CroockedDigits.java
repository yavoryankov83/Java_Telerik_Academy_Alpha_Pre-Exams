package croocked_Digits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroockedDigits {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String inputNumberAsString = reader.readLine();

    int resultNumber;

    do {
      resultNumber = 0;

      for (int index = 0; index < inputNumberAsString.length(); index++) {
        char currentChar = inputNumberAsString.charAt(index);

        if (Character.isDigit(currentChar)) {
          int digit = currentChar - '0';

          resultNumber += digit;
        }
      }

      inputNumberAsString = String.valueOf(resultNumber);
    }
    while (resultNumber > 9);

    System.out.println(resultNumber);
  }
}
