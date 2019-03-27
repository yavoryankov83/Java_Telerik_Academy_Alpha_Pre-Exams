package speeds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Speeds {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int numOfCars = Integer.parseInt(reader.readLine());

    List<Integer> cars = new ArrayList<>();

    for (int i = 0; i < numOfCars; i++) {
      int currentCarSPeed = Integer.parseInt(reader.readLine());
      cars.add(currentCarSPeed);
    }

    int firstCarSpeed = cars.get(0);

    int currentLenght = 1;
    int maxLenght = 1;

    int currentSum = firstCarSpeed;
    int maxSum = firstCarSpeed;


    for (int index = 1; index < cars.size(); index++) {
      int nextSpeed = cars.get(index);

      if (firstCarSpeed < nextSpeed) {
        currentLenght++;
        currentSum += nextSpeed;
      } else {
        firstCarSpeed = nextSpeed;
        currentSum = nextSpeed;
        currentLenght = 1;
      }

      if (currentLenght > maxLenght) {
        maxLenght = currentLenght;
        maxSum = currentSum;
      } else if (currentLenght == maxLenght) {
        maxSum = Math.max(maxSum, currentSum);
      }
    }

    System.out.println(maxSum);
  }
}
