
import java.util.*;
import java.lang.Math;

class soal_nomor_4 {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int n, sumfaktor;

    System.out.println("Masukkan nilai untuk dijumlahkan faktor positifnya:");

    n = input.nextInt();
    sumfaktor = sumfaktor(n, 1);
    System.out.println("Hasil dari penjumlahan semua faktor dari " + n);
    System.out.println("Adalah " + sumfaktor);
  }

  public static int sumfaktor(int n, int i) {
    int sum;

    if (i > n) {
      n = 0;
    } else {
      if (n % i == 0) {
        n = i + sumfaktor(n, i + 1);
      } else {
        n = sumfaktor(n, i + 1);
      }
    }

    return n;
  }
}
