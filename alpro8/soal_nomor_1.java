
import java.util.*;

public class Main {
  static HashMap<Integer, Integer> frekuensi = new HashMap<>();
  static int maxCount = 0;

  public static void countFrekuensi(int[] x, int n) {
    if (n == 0)
      return;
    frekuensi.put(x[n - 1], frekuensi.getOrDefault(x[n - 1], 0) + 1);
    countFrekuensi(x, n - 1);
  }

  public static ArrayList<Integer> findModes() {
    ArrayList<Integer> modes = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
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
    countFrekuensi(x, n);
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

    System.out.println("Hasil dari modus array X adalah :" + modus(x, x.length)); // Output: 2
  }
}
