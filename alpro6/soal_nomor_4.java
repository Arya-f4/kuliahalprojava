import java.util.*;

public class soal_nomor_4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan tanggal (format DD-MM-YYYY): ");
    String date = scanner.nextLine();
    String dateWithoutHyphens = date.replace("-", "");
    String reverseDateWithoutHyphens = new StringBuilder(dateWithoutHyphens).reverse().toString();
    if (dateWithoutHyphens.equals(reverseDateWithoutHyphens)) {
      System.out.println(date + " adalah tanggal palindrom");
    } else {
      System.out.println(date + " bukan tanggal palindrom");
    }
  }
}
