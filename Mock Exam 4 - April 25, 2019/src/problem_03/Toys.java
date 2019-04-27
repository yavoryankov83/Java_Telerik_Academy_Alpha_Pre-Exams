package problem_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Toys {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int count = Integer.parseInt(reader.readLine());

    String[] wantedToy = new String[1];
    int[] koci = new int[1];

    int minDifference = Integer.MAX_VALUE;

    for (int i = 0; i < count; i++) {
      List<String> tokens = Arrays
              .stream(reader.readLine()
                      .split("\\s+"))
              .collect(Collectors.toList());

      int kociLike = Integer.parseInt(tokens.get(1));
      int kokiLike = Integer.parseInt(tokens.get(2));

      int differrence = kokiLike - kociLike;

      if (differrence < 0){
        continue;
      }

      String currentToy = tokens.get(0);

      if (differrence < minDifference){
        minDifference = differrence;
        wantedToy[0] = currentToy;
      } else if (differrence == minDifference){
        if (koci[0] > kociLike){
          wantedToy[0] = currentToy;
        }
      }
    }

    System.out.println(wantedToy[0]);
  }
}
