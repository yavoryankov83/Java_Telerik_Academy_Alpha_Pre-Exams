package problem_14_GDPR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Gdpr {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder builder = new StringBuilder();
    ArrayDeque<Character> characters = new ArrayDeque<>();

    int count = Integer.parseInt(reader.readLine());
    char[] message = reader.readLine().toCharArray();

    for (int i = 0; i < message.length; i += 3) {
      for (int j = i; j < count + i; j++) {
        characters.addFirst(message[j]);
      }
      while (!characters.isEmpty()){
        builder.append(characters.poll());
      }

      builder.append(" ");
    }

    System.out.println(builder.toString());

//    for (int i = 0; i < message.length(); i += count) {
//      int index = i;
//      String currentWord = message.substring(index, index + count);
//      builder.append(builder.append(currentWord).reverse());
//    }
  }
}
