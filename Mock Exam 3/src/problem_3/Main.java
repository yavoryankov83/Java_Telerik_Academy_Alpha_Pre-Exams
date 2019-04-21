package problem_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder builder = new StringBuilder();

    char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    String word = reader.readLine();

    char[] chars = word.toCharArray();

    int length = chars.length % 2 == 0 ? chars.length / 2 : chars.length / 2 + 1;

    for (int i = 0; i < length; i++) {
      char first = chars[i];
      char last = chars[chars.length - 1 - i];

      int firstChar = first - 97;
      int lastChar = last - 97;

      if (first == ' ' || last == ' ') {
        builder.append(" ");
      } else if (first == last) {
        builder.append(first);
      } else {
        int currentNum = Math.abs(firstChar - lastChar);
        char letter = letters[currentNum];

        builder.append(letter);
      }
    }

    System.out.println(builder.toString());
  }
}
