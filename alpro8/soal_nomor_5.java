
import java.util.*;

public class Main {
    public static ArrayList<Integer> maxIndex(int[] x, int n) {
        int max = x[0];
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(x[i] > max) {
                max = x[i];
                indices.clear();
                indices.add(i);
            } else if(x[i] == max) {
                indices.add(i);
            }
        }
        return indices;
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
        System.out.println(maxIndex(x, x.length));  // Output: [2, 4]
    }
}

