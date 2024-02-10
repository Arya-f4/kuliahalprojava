
import java.util.*;
import java.lang.Math;

public class soal_nomor_1 {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    double beratilang, mean, bebeksemuaberat, totalberatbebek, meanawal, semuabebek, diff, bebek1, bebek2;
    int n, i;

    System.out.println("Bebek anda hilang 2!");
    System.out.println("Masukkan bebek yang ada (Di soal ada 8):");
    n = input.nextInt();
    double[] beratbebek = new double[n];

    for (i = 0; i <= n - 1; i++) {
      System.out.print("Masukkan Berat Bebek ke -");
      System.out.println(i + 1);
      bebeksemuaberat = input.nextDouble();
      beratbebek[i] = bebeksemuaberat;
    }
    totalberatbebek = 0;
    for (i = 0; i <= n - 1; i++) {
      totalberatbebek = totalberatbebek + beratbebek[i];
    }
    System.out.print("Total berat bebek yang ada adalah :");
    System.out.println(totalberatbebek);
    mean = totalberatbebek / n;
    System.out.println("Masukkan rata-rata yang pertama sebelum bebek anda hilang:");
    meanawal = input.nextDouble();
    semuabebek = n + 2;
    meanawal = meanawal * semuabebek;
    bebek1 = meanawal - totalberatbebek;
    System.out.println("Masukkan selisih bebek pertama dan kedua ");
    diff = input.nextDouble();
    bebek1 = (bebek1 - diff) / 2;
    bebek2 = diff + bebek1;
    System.out.println("Berat Bebek yang hilang pertama adalah :" + bebek1);
    System.out.println("Berat bebek kedua yang hilang adalah:" + bebek2);
  }
}
