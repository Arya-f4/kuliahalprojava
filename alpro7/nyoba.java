import java.util.*;

public class nyoba {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number = input.nextInt();
    int reversed = 0;
    while (number != 0) {
      int digit = number % 10;
      reversed = reversed * 10 + digit;
      number /= 10;
    }
    while (reversed != 0) {
      int digit = reversed % 10;
      System.out.print(digit + " ");
      reversed /= 10;
    }
  }
}
