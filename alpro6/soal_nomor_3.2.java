import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class program {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Masukkan Nilai 20 angka satu line dengan pemisah spasi : ");
    String inputnya = input.next();
    String[] numbers = inputnya.split(" ");
    int[] array = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      array[i] = Integer.parseInt(numbers[i]);
    }

    List<Integer> longestIncreasingSequence = new ArrayList<>();
    List<Integer> tempSequence = new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      if (i == 0 || array[i - 1] < array[i]) {
        tempSequence.add(array[i]);
        if (tempSequence.size() > longestIncreasingSequence.size()) {
          longestIncreasingSequence = new ArrayList<>(tempSequence);
        }
      } else {
        tempSequence.clear();
        tempSequence.add(array[i]);
      }
    }

    System.out.print(longestIncreasingSequence.get(0));
    for (int i = 1; i < longestIncreasingSequence.size(); i++) {
      System.out.print("  " + longestIncreasingSequence.get(i));
    }
    System.out.println(" (" + longestIncreasingSequence.size() + ")");
  }
}
