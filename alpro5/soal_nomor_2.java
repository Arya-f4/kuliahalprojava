
import java.util.*;
import java.lang.Math;

class soal_nomor_2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, o;
        double r;
    System.out.println("Masukkan Angka N yang digunakan untuk menjumlahkan keseluruhannya : ");

        n = input.nextInt();
        int[] angka = new int[n + 1];

        for (i = 0; i <= n; i++) {
            angka[i] = i;
        }
        i = 0;
        o = 0;
        for (i = 0; i <= n; i++) {
            o = o + angka[i];
        }
        r = (double) o / n;
        System.out.print("Jumlah seluruh bilangan tersebut adalah: ");
        System.out.println(o);
        System.out.print("Rata-rata dari jumlah keseluruhan tersebut adalah :");
        System.out.println(r);
    }
}
