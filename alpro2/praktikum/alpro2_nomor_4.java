import java.util.*;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class alpro2_nomor_4 {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.print("Masukkan waktu keberangkatan anda (contoh 08.00) : ");

        String t1 = input.next();
    System.out.print("Masukkan Jarak keberangkatan anda dalam kilometer( angka saja) : ");
        double s = input.nextDouble();
    System.out.print("Masukkan Kecepatan keberangkatan anda dalam Kilometer perjam (angka saja)  : ");
        double v = input.nextDouble();

        String[] split = t1.split("\\.");
        LocalTime waktuberangkat = LocalTime.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]));

        double waktudalamjam = s / v;
        long waktudalamMenit = (long) (waktudalamjam * 60);

        LocalTime waktuDatang = waktuberangkat.plus(waktudalamMenit, ChronoUnit.MINUTES);
        waktuDatang = waktuDatang.plus(45, ChronoUnit.MINUTES);  // Add rest time

        System.out.println("Waktu kedatangan: " + waktuDatang);
    }
}
