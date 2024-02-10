import java.util.*;

/**
 * binary
 */
public class binary {

  public static void main(String[] args) {
    System.out.println("Masukkan angka yang ingin anda konversi ke biner");
    Scanner input = new Scanner(System.in);
    int angkabiasa = input.nextInt();
    convertBin(angkabiasa);

  }

  public static void convertBin(int angka) {

    if (angka % 2 == 0) {

      convertBin(angka / 2);
      System.out.print(angka);
    }
    else{
      System.out.print("1");

    System.out.print(angka/2);
    }
  }
}
