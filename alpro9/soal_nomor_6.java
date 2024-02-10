import java.util.*;
import java.lang.Math;

class soal_nomor_6 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        int i;


    System.out.println("Masukkan nilai untuk ditampilkan semua faktor positif primanya:");

        n = input.nextInt();
        i = 2;
        System.out.println(cekprima(n, i));
    }
    
    public static int cekprima(int n, int i) {
        int prima;

        if (n <= 1) {
            prima = 1;
        } else {
            if (n % i == 0) {
                System.out.println(i);
                prima = cekprima((int) ((double) n / i), i);
            } else {
                prima = cekprima(n, i + 1);
            }
        }
        
        return prima;
    }
}

