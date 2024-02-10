import java.util.*;

import java.lang.Math;

public class soal_nomor_1 {
    private static Scanner input = new Scanner(System.in);


  public static void main(String[] args) {
    System.out.println("Masukkan jumlah angka yang ingin anda jumlahkan");
    int counter = input.nextInt();
    int[]numbers = new int[counter];
   for (int i=0;i <= counter-1;i++) {
      System.out.println("Masukkan Angka ke - "+(i+1));
      numbers[i]= input.nextInt();

    
   } 
    int total = 0;
  for (int i = 0; i <= counter-1; i++) {
     total +=numbers[i];



    
  }
    System.out.println("Total semua angka adalah : "+total);
  }
}


