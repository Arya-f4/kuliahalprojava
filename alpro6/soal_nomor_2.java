
import java.util.*;
import java.lang.Math;

class Program {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int beratbebek, kurus, langsing, standard, gemuk, obesitas, jumlahkurus, jumlahlangsing, jumlahstandard,
        jumlahgemuk, jumlahobesitas;
    int n, i;

    System.out.print("Masukkan bebek yang ada (By default soalnya ada 10):");
    n = input.nextInt();
    int[] bebek = new int[n];

    kurus = 0;
    langsing = 0;
    standard = 0;
    gemuk = 0;
    obesitas = 0;
    jumlahobesitas = 0;
    jumlahgemuk = 0;
    jumlahstandard = 0;
    jumlahlangsing = 0;
    jumlahkurus = 0;
    for (i = 0; i <= n - 1; i++) {
      System.out.print("Masukkan berat bebek ke - " + (i + 1));
      System.out.println(" Dalam bentuk Ons");
      beratbebek = input.nextInt();
      bebek[i] = (int) beratbebek;
      if (beratbebek > 20) {
        obesitas = obesitas + beratbebek;
        jumlahobesitas = jumlahobesitas + 1;
      } else {
        if (beratbebek > 15) {
          gemuk = gemuk + beratbebek;
          jumlahgemuk = jumlahgemuk + 1;
        } else {
          if (beratbebek > 10) {
            standard = standard + beratbebek;
            jumlahstandard = jumlahstandard + 1;
          } else {
            if (beratbebek > 7) {
              langsing = langsing + beratbebek;
              jumlahlangsing = jumlahlangsing + 1;
            } else {
              if (beratbebek < 7) {
                kurus = kurus + beratbebek;
                jumlahkurus = jumlahkurus + 1;
              }
            }
          }
        }
      }
    }
    System.out.println("Berikut adalah jumlah data dari bebek-bebek yang ada");
    System.out.println("Bebek yang obesitas ada :" + jumlahobesitas);
    System.out.println("Beratnya adalah :" + obesitas);
    System.out.println("Bebek yang gemuk ada :" + jumlahgemuk);
    System.out.println("Beratnya adalah :" + gemuk);
    System.out.println("Bebek yang standard ada :" + jumlahstandard);
    System.out.println("Beratnya adalah :" + standard);
    System.out.println("Bebek yang langsing ada :" + langsing);
    System.out.println("Beratnya adalah :" + jumlahlangsing);
    System.out.println("Bebek yang kurus ada :" + jumlahkurus);
    System.out.println("Beratnya adalah :" + kurus);
  }
}
