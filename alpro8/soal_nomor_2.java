
import java.util.*;

public class Main {
  static HashMap<Integer, Integer> freq = new HashMap<>();
  static int maxCount = 0;

  public static void countFrequency(int[] x, int n) {
    if (n == 0)
      return;
    freq.put(x[n - 1], freq.getOrDefault(x[n - 1], 0) + 1);
    countFrequency(x, n - 1);
  }

  public static ArrayList<Integer> findModes() {
    ArrayList<Integer> modes = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
      if (maxCount < entry.getValue()) {
        maxCount = entry.getValue();
        modes.clear();
        modes.add(entry.getKey());
      } else if (maxCount == entry.getValue()) {
        modes.add(entry.getKey());
      }
    }
    return modes;
  }

  public static ArrayList<Integer> modus(int[] x, int n) {
    countFrequency(x, n);
    return findModes();
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Banyak nilai dalam array : ");
    int i = input.nextInt();

    int[] x = new int[i];
    for (int j = 0; j < x.length; j++) {
      System.out.println("Masukkan nilai dari array ke - " + (j + 1));
      x[j] = input.nextInt();

    }
    ArrayList<Integer> modes = modus(x, x.length);
    System.out.println("Jumlah modus: " + maxCount); // Output: Jumlah modus: 5
  }
}
