package problem_1_Magic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Magic {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());

    StringBuilder builder = new StringBuilder();

    char[] alphabet = {'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    List<Character> letters = Arrays.asList('0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    char firstLetter = alphabet[count];

    String firstSymbol = Character.toString(firstLetter).toUpperCase();
    String secondSymbol = String.valueOf(count);
    String thirdSymbol = Character.toString(alphabet[alphabet.length - count]).toUpperCase();
    String lastSymbol = Character.toString('A');

//    int index = -1;
//
//    for (int i = 0; i < (alphabet.length) && (index == -1); i++) {
//      if (alphabet[i] == firstLetter){
//        index = i;
//      }
//    }

    int index = letters.indexOf(firstLetter);

    if (index > (alphabet.length + 1) / 2) {
      lastSymbol = Character.toString('B');
    }

    builder.append(firstSymbol)
            .append(secondSymbol)
            .append(thirdSymbol)
            .append(lastSymbol);

    System.out.println(builder.toString());
  }
}
