package alpro7;

import java.util.*;

public class soal_nomor_5 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Masukkan Nilai N :");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isTriangleNumber(i)) {
                System.out.println(i + " merupakan angka segitiga");
            } else {
                System.out.println(i + " bukan angka segitiga");
            }
        }
    }

    public static boolean isTriangleNumber(int num) {
        int sum = 0;
        for (int i = 1; sum < num; i++) {
            sum += i;
            if (sum == num) {
                return true;
            }
        }
        return false;
    }

  
}
