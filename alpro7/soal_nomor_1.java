package alpro7;

import java.util.*;

public class soal_nomor_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] x = new int[5];
    int[] y = new int[5];
    int[] z = new int[10];
    System.out.println("Masukkan Array ke 1");
    for (int i = 0; i < x.length; i++) {
      System.out.println("Masukkan Array ke -" + (i + 1));
      x[i] = input.nextInt();

    }
    //batas
 int i, j, temp;
        boolean swapped;
        for (i = 0; i < x.length; i++) {
            swapped = false;
            for (j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    System.out.println("Masukkan Untuk array ke 2");
    for ( i = 0; i < y.length; i++) {
      System.out.println("Masukkan Array ke -" + (i + 1));
      y[i] = input.nextInt();

    }
 for (i = 0; i < y.length; i++) {
            swapped = false;
            for (j = 0; j < y.length - i - 1; j++) {
                if (y[j] > y[j + 1]) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    System.out.print("Jumlah dari array x atau yang pertama adalah : [");
    for ( i = 0; i < x.length; i++) {
      System.out.print(x[i] + " ");

    }
    System.out.print(" ]");

    System.out.println("");
    System.out.print("Jumlah dari array y atau yang pertama adalah : [");
    for ( i = 0; i < y.length; i++) {
      System.out.print(y[i] + " ");

    }
    System.out.print(" ]");

    System.out.println("");

    i = 0;
     j = 0;
    int k = 0;
    while (i < x.length && j < y.length) {
      if (x[i] < y[j]) {
        z[k++] = x[i++];
      } else {
        z[k++] = y[j++];
      }
    }

    while (i < x.length) {
      z[k++] = x[i++];
    }

    while (j < y.length) {
      z[k++] = y[j++];
    }
    System.out.println("Hasil dari semua nilai dari array Z adalah : ");
System.out.print("[ ");
    for (int a : z) {
      System.out.print(a + " ");
    }
    System.out.print(" ]");
  }
}
