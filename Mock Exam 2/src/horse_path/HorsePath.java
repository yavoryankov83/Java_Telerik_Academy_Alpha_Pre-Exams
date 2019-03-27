package horse_path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorsePath {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int size = Integer.parseInt(reader.readLine());

    int[][] matrix = new int[size][size];

    int[] moveByCols = {-2, -2, -1, -1, +1, +1, +2, +2};
    int[] moveByRows = {-1, +1, -2, +2, -2, +2, -1, +1};

    int counter = 1;

    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        while (matrix[row][col] == 0) {
          matrix[row][col] = counter;
          counter++;

          for (int index = 0; index < moveByCols.length; index++) {
            int nextRow = row + moveByCols[index];
            int nextCol = col + moveByRows[index];

            if (nextRow < 0 || nextRow >= matrix.length
                    || nextCol < 0 || nextCol >= matrix[row].length) {
              continue;
            }

            if (matrix[nextRow][nextCol] != 0) {
              continue;
            }

            row = nextRow;
            col = nextCol;

            break;
          }
        }
      }
    }

    for (int rows = 0; rows < matrix.length; rows++) {
      for (int cols = 0; cols < matrix[rows].length; cols++) {
        System.out.print(matrix[rows][cols] + " ");
      }
      System.out.println();
    }
  }
}
