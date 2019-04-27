package problem_6_Long_Sequence;

public class LongSequence {

  public static void main(String[] args) {
    for (int i = 2; i < 1002; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      } else {
        System.out.println(-i);
      }
    }
  }
}
