import java.util.*;

public class alpro2_nomor_2 {

    private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    
    double n, k ;
    System.out.println("Diketahui rata-rata dari empat bilangan adalah n. Bilangan tersebut adalah 6, 9, 11 dan k. Jika n adalah sebuah bilangan yang diinputkan oleh user, tentukan nilai k! ");
    System.out.print("Masukkan Angka yang anda inginkan sebagai N : ");
    n = input.nextDouble();
    k = (n*4)-(6+9+11);

    System.out.println("Hasil dari nilai K adalah : "+k);

  }
}
