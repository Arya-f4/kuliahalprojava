
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah baris (n): ");
        int n = scanner.nextInt();
        System.out.println("Masukkan jumlah kolom (m): ");
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Masukkan elemen baris " + (i+1) + " kolom " + (j+1) + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        int min = findMin(arr);
        System.out.println("Nilai minimum dalam array adalah: " + min);
    }

    public static int findMin(int[][] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }

        return min;
    }
}
