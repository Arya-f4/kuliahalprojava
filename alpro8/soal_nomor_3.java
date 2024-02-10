
import java.util.*;

public class Main {
    public static double median(int[] x, int n) {
        Arrays.sort(x);
        if(n % 2 == 1) {
            return x[n/2];
        } else {
            return (x[(n-1)/2] + x[n/2]) / 2.0;
        }
    }

    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Banyak nilai dalam array : ");
    int i = input.nextInt();

    int[] x = new int[i];
    for (int j = 0; j < x.length; j++) {
      System.out.println("Masukkan nilai dari array ke - " + (j + 1));
      x[j] = input.nextInt();

    }
        System.out.println(median(x, x.length));  // Output: 18.0

    }
}

