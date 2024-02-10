import java.util.*;

public class teori_soal_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Masukkan Kata-kata:");
    String kata = scanner.nextLine();

    System.out.println("Masukkan karakter yang ingin dihitung:");
    char huruf = scanner.next().charAt(0);

    int jumlah = hitungKarakter(kata, huruf, 0);
    System.out.println("Huruf " + huruf + " ada " + jumlah + " di kata " + kata);
  }

  public static int hitungKarakter(String kata, char huruf, int index) {
    if (index >= kata.length()) {
      return 0;
    } else if (kata.charAt(index) == huruf) {
      return 1 + hitungKarakter(kata, huruf, index + 1);
    } else {
      return hitungKarakter(kata, huruf, index + 1);
    }
  }
}
