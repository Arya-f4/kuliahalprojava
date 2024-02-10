import java.util.*;
public class soal_nomor_1 {

    private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Masukkan Angka n yang anda inginkan untuk dijumlahkan ganjilnya :");
    int n = input.nextInt();
    int hasil = 0;
for (int i = 1; i < n; i = i+2) {
      hasil = hasil + i;
      System.out.println("Bilangan gasal : "+i);
  
}
    System.out.println("Hasil jumlahan semua bilangan gasal adalah :"+hasil);

  }
}
