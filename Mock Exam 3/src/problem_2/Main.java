package problem_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());

    int minWordWeight = Integer.MAX_VALUE;
    String[] haviestWord = new String[1];

    for (int i = 0; i < count; i++) {
      String currentWord = reader.readLine();

      int currentWordWeight = getWeight(currentWord);

      if (currentWordWeight < minWordWeight) {
        haviestWord[0] = currentWord;
      }

      minWordWeight = Math.min(minWordWeight, currentWordWeight);
    }

    System.out.println(String.format("%d %s", minWordWeight, haviestWord[0]));
  }

  private static int getWeight(String currentWord) {

    int sum = 0;

    char[] wordToLower = currentWord.toLowerCase().toCharArray();

    for (int i = 0; i < wordToLower.length; i++) {
      sum += wordToLower[i] - 96;
    }

    return sum;
  }
}
