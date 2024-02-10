package alpro7;


import java.util.Scanner;

public class soal_nomor_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen array:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan array ke-"+i);
          
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Array setelah diurutkan:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
