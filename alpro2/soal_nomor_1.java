import java.util.*;

public class soal_nomor_1 {

    private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Inputkan Angka yang anda inginkan: ");
    int angka = input.nextInt();

    if (angka % 2 == 0) {
      System.out.println("Genap");
      
    }
    else {
      System.out.println("Ganjil");
    }

    
  }
}
