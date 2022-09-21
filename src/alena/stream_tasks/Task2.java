package alena.stream_tasks;

import java.util.stream.IntStream;

public class Task2 {

    public static void main(String[] args) {

        int number=5;
        factorialNumber(number);

    }

  public static int factorialNumber(int number){

      int result=IntStream.rangeClosed(1, number).reduce(1, (x, y) -> x * y);
      return result;
  }


}
