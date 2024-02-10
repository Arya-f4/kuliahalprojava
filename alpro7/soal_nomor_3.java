package alpro7;

import java.util.Scanner;
public class soal_nomor_3 {
 
    public static void main(String[] args) {
      try (Scanner input = new Scanner(System.in)) {
        int x = input.nextInt();
          int[] arr = new int[x];
          for (int i = 0; i < arr.length; i++) {
            System.out.println("Masukkan nilai dari array ke-"+(i+1));
            arr[i] = input.nextInt();
            
          }

          int maxSum = 0;
          int currentSum = arr[0];
          int start = 0;
          int end = 0;

          for (int i = 1; i < arr.length; i++) {
              if (arr[i] > arr[i - 1]) {
                  currentSum += arr[i];
                  if (currentSum > maxSum) {
                      maxSum = currentSum;
                      end = i;
                  }
              } else {
                  currentSum = arr[i];
                  start = i;
              }
          }

          System.out.println("Output: ");


          for (int v=start; v <= end; v++) {
              System.out.print(arr[v] + " ");
          }
          System.out.println("");
          System.out.println(maxSum);
      }
    }
}
 

