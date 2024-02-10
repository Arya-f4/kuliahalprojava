import java.util.*;

public class alpro1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[10];
    for (int i = 0; i < 9; i++) {
      System.out.println("Inputkan array ke-" + i + 1);
      array[i] = input.nextInt();

    }
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          // menukar array[j] and array[j+1]
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
