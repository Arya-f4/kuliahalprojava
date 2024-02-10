
import java.util.*;
import java.lang.Math;

class soal_nomor_5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, count;

    System.out.println("Masukkan nilai untuk ditampilkan berapa jumlah faktor positif:");
        n = input.nextInt();
        i = 0;
        count = 0;
        System.out.println(countfactor(n, i + 1, count));
    }
    
    public static int countfactor(int n, int i, int count) {
        int allfactor;

        if (i <= n) {
            if (n % i == 0) {
                count = count + 1;
            }
            allfactor = countfactor(n, i + 1, count);
        } else {
            allfactor = count;
        }
        
        return allfactor;
    }
}
