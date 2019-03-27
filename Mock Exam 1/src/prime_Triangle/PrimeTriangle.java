package prime_Triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PrimeTriangle {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int inputNumber = Integer.parseInt(reader.readLine());

    List<Integer> primeNumbers = new ArrayList<>();

    for (int i = 1; i <= inputNumber; i++) {
      if (isPrime(i)) {
        primeNumbers.add(i);
      }
    }

    int rowsLenght = primeNumbers.size();

    for (int i = 0; i < rowsLenght; i++) {
      for (int j = 1; j <= primeNumbers.get(i); j++) {
        int result = 0;

        if (isPrime(j)) {
          result = 1;
        }

        System.out.print(result);
      }

      System.out.println();
    }
  }

  public static boolean isPrime(int number) {
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }

    return true;
  }
}
