import java.util.*;

public class teori_soal_2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jumlah Array yang anda inginkan:");
    int n = input.nextInt();

    int[] array = new int[n];
 for (int i = 0; i < array.length; i++) {

      System.out.println("Masukkan Nilai Array ke -"+(i+1));
      array[i]=input.nextInt();

    }
    int jumlah = jumlahArray(array, array.length - 1);
   
    System.out.println("Jumlah elemen dalam array adalah " + jumlah);
  }

  public static int jumlahArray(int[] array, int index) {
    if (index < 0) {
      return 0;
    } else {
      return array[index] + jumlahArray(array, index - 1);
    }
  }
}
