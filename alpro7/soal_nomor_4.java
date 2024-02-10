package alpro7;

import java.util.*;

public class soal_nomor_4 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Masukkan nilai n1 : ");
        int n1 =input.nextInt(); 
      System.out.println("Masukkan nilai n2 : ");
        int n2 = input.nextInt(); 
        int count = 0, n = 10;

        System.out.print("Bilangan Fibonacci: ");

        while (count < n) {
            System.out.print(n1 + " ");

            int nth = n1 + n2;
            n1 = n2;
            n2 = nth;

            count++;
        }
    }
 
}
