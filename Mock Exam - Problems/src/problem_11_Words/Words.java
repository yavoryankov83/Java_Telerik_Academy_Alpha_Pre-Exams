package problem_11_Words;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Words {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] pair = Arrays
            .stream(reader.readLine()
                    .split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray();

    int difference = pair[1];
    StringBuilder builder = new StringBuilder();


    for (int i = 0; i < pair[0]; i++) {
      char[] currentWord = reader.readLine().toCharArray();

      int result = isDifference(currentWord, difference);

      builder.append(result);
    }

    System.out.println(builder.toString());
  }

  private static int isDifference(char[] currentWord, int difference) {
    for (int i = 0; i < currentWord.length - 1; i++) {
      char prevLetter = currentWord[i];
      char nextLetter = currentWord[i + 1];

      if (nextLetter - prevLetter <= difference){
        continue;
      } else {
        return 0;
      }
    }
    return 1;
  }
}
