package problem_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main1 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Map<String, Integer> result = new HashMap<>();

    int countOfWords = Integer.parseInt(reader.readLine());

    for (int i = 0; i < countOfWords; i++) {
      String currentWord = reader.readLine();
      int currentWordWeight = getWeight(currentWord);

      result.put(currentWord, currentWordWeight);
    }

    result.entrySet()
            .stream()
            .sorted((x, y) -> x.getValue() - y.getValue())
            .limit(1)
            .forEach(x -> System.out.println(x.getValue() + " " + x.getKey()));
  }

  private static int getWeight(String currentWord) {
    int sum = 0;

    char[] wordAsChars = currentWord.toLowerCase().toCharArray();

    for (char wordAsChar : wordAsChars) {
      sum += wordAsChar - 96;
    }

    return sum;
  }
}
