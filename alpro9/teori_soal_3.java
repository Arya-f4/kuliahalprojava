
import java.util.*;

public class teori_soal_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Masukkan kata:");
    String kata = scanner.nextLine();

    boolean isPalindrom = cekPalindrom(kata, 0, kata.length() - 1);
    System.out.println("Apakah kata '" + kata + "' adalah palindrom? " + isPalindrom);
  }

  public static boolean cekPalindrom(String kata, int awal, int akhir) {
    if (awal >= akhir) {
      return true;
    } else if (kata.charAt(awal) != kata.charAt(akhir)) {
      return false;
    } else {
      return cekPalindrom(kata, awal + 1, akhir - 1);
    }
  }
}
