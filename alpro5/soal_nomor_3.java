
import java.util.*;
import java.lang.Math;

class soal_nomor_3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n, o, a, large;

        System.out.println("Masukkan Size Array Yang anda inginkan");
        a = input.nextInt();
        int[] data = new int[a];

        System.out.print("Masukkan List Angka yang anda masukkan tadi sebanyak ");
        System.out.println(a);
        for (i = 0; i <= a - 1; i++) {
            data[i] = input.nextInt();
        }
        large = data[0];
        n = 1;
        while (n <= i - 1) {
            if (data[n] > large) {
                large = data[n];
            } else {
                n = n + 1;
            }
        }
        System.out.print("[");
        for (o = 0; o <= a - 1; o++) {
            System.out.print(data[o]);
            System.out.print(" ");
        }
        System.out.println("]");
        System.out.print("Nilai Terbesar dari array diatas adalah :");
        System.out.println(large);
    }
}
