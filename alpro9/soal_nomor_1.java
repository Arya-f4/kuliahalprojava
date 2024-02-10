
import java.util.*;
import java.lang.Math;

class soal_nomor_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, max;

        System.out.println("Masukkan angka yang ingin anda ambil terbesarnya");
        n = input.nextInt();
        max = max(n);
        System.out.println(max);
    }
    
    public static int max(int n) {
        int maxDigit, remaining, maxRemaining, max;

        if (n < 10) {
            max = n;
        } else {
            maxDigit = n % 10;
            remaining = (int) ((double) n / 10);
            maxRemaining = max(remaining);
            if (maxDigit > maxRemaining) {
                max = maxDigit;
            } else {
                max = maxRemaining;
            }
        }
        
        return max;
    }
}

