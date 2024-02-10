import java.util.*;
import java.util.*;
import java.util.*;

/**
 * soal_nomor_1
 */


    
  public class soal_nomor_1 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukkan angka: ");
      int angka = input.nextInt();
      int[] arr = new int[angka];
      for (int i = 0; i < arr.length; i++) {
        System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
        arr[i] = input.nextInt();
      }
      System.out.println("Angka yang diinputkan: " + Arrays.toString(arr));

     
      Arrays.sort(arr);
      int[] descendingArr = new int[arr.length];
      for (int i = 0; i < arr.length; i++) {
        descendingArr[i] = arr[arr.length - 1 - i];
      }

      System.out.println("Angka yang diinputkan (descending): " + Arrays.toString(descendingArr));

  
      double median;
      if (arr.length % 2 == 0) {
        median = (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
      } else {
        median = arr[arr.length / 2];
      }

      System.out.println("Median: " + median);
    }
  }
