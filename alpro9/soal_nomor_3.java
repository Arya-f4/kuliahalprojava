
import java.util.*;
import java.lang.Math;

class soal_nomor_3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i;

        i = 1;
    System.out.println("Masukkan nilai untuk ditampilkan faktor positif:");
        n = input.nextInt();
        faktorial(n, i);
    }
    
    public static int faktorial(int n, int i) {
        if (i <= n) {
            if (n % i == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
            faktorial(n, i + 1);
        }
        
        return i;
    }
}
