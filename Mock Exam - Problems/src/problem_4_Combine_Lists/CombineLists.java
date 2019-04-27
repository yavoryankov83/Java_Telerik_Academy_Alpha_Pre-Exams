package problem_4_Combine_Lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombineLists {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> nums_1 = Arrays
            .stream(reader.readLine()
                    .split(","))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());

    List<Integer> nums_2 = Arrays
            .stream(reader.readLine()
                    .split(","))
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());

    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < nums_1.size(); i++) {
      result.add(nums_1.get(i));
      result.add(nums_2.get(i));
    }

    int count = 0;
    for (Integer integer : result) {
      count++;

      if (result.size() == count) {
        System.out.print(integer);
      } else {
        System.out.print(integer + ",");
      }
    }
  }
}

