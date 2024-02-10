import java.util.*;

public class Main {
    public static int[] kurangNilaiMin(int[] x, int n) {
        int min = x[0];
        for(int i = 1; i < n; i++) {
            if(x[i] < min) {
                min = x[i];
            }
        }
        for(int i = 0; i < n; i++) {
            x[i] -= min;
        }
        return x;
    }

    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Banyak nilai dalam array : ");
    int n = input.nextInt();

    int[] x = new int[n];
    for (int j = 0; j < x.length; j++) {
      System.out.println("Masukkan nilai dari array ke - " + (j + 1));
      x[j] = input.nextInt();

    }

        int[] result = kurangNilaiMin(x, x.length);
        for(int i : result) {
            System.out.print(i + " ");  // Output: 3 1 7 0 7 
        }
    }
}
