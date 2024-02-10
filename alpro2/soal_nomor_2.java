import java.util.*;

public class soal_nomor_2 {

    private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.println("Masukkan tinggi yang anda inginkan");
    double tinggi = input.nextDouble();
    if (tinggi < 120) {
      System.out.println("Kamu Pendek");
      
    } else if (tinggi == 120 || tinggi <150) {
      System.out.println("Kamu Sedang");
    }
    else{
      System.out.println("Kamu Tinggi");
    }

    
  }
}
